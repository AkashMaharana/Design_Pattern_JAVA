package dependencyInversionPrinciple;

public class Application {
	
	public static void main(String[] args) {
		DatabaseHandler dbHandler=new DatabaseHandler(new OracleDatabase());
		dbHandler.connect();
	}

}
