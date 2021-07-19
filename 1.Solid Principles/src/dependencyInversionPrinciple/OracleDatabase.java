package dependencyInversionPrinciple;

public class OracleDatabase implements Database{

	@Override
	public void connect() {
		System.out.println("Connect Oracle DB");
	}

}
