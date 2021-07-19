package singletonPattern;

public class BillPughSingleton {
	
	private BillPughSingleton() {
		
	}
	
	private static class SingletonInstance {
		private static final BillPughSingleton INSTANCE=new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return SingletonInstance.INSTANCE;
	}

}
