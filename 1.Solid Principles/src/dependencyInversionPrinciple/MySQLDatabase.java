package dependencyInversionPrinciple;

public class MySQLDatabase implements Database{

	@Override
	public void connect() {
		System.out.println("Connect MySQL DB");
	}

}
