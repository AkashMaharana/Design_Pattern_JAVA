package abstractFactoryPattern;

public class Application {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(CarFactory.buildCar(CarType.MICRO));
		} catch(LocationNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
