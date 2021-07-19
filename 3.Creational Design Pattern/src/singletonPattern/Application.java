package singletonPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Application {

	public static void main(String[] args) {
		ThreadSafeLazySingleton singleton1 = ThreadSafeLazySingleton.getSingletonInstance();
		ThreadSafeLazySingleton singleton2 = ThreadSafeLazySingleton.getSingletonInstance();
		ThreadSafeLazySingleton singleton3 = ThreadSafeLazySingleton.getSingletonInstance();
		System.out.println("singleton1 : "+singleton1.hashCode());
		System.out.println("singleton2 : "+singleton2.hashCode());
		System.out.println("singleton3 : "+singleton3.hashCode());

		System.out.println();

		BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();
		BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
		BillPughSingleton billPughSingleton3 = BillPughSingleton.getInstance();
		System.out.println("billPughSingleton1 : "+billPughSingleton1.hashCode());
		System.out.println("billPughSingleton2 : "+billPughSingleton2.hashCode());
		System.out.println("billPughSingleton3 : "+billPughSingleton3.hashCode());
		
		System.out.println();

		ThreadSafeLazySingleton singletonSerialization = ThreadSafeLazySingleton.getSingletonInstance();
		try {
			String filePath="C://Users//Administrator//OneDrive//Desktop//Design_Pattern//3.Creational Design Pattern//src//singletonPattern//serialization.txt";
			// Serialization
			ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream(filePath));
			objectOutput.writeObject(singletonSerialization);
			objectOutput.close();

			// Deserialization
			ObjectInput objectInput = new ObjectInputStream(new FileInputStream(filePath));
			ThreadSafeLazySingleton singletonDeserialization = (ThreadSafeLazySingleton) objectInput.readObject();
			objectInput.close();
			
			System.out.println("singletonSerialization : "+singletonSerialization.hashCode());
			System.out.println("singletonDeserialization : "+singletonDeserialization.hashCode());

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
