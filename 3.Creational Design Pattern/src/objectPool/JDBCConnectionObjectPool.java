package objectPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionObjectPool extends ObjectPool<Connection>{
	
	private String connectionUrl;
	private String userName;
	private String password;
	
	

	public JDBCConnectionObjectPool(String driverName, String connectionUrl, String userName, String password) {
		try {
			Class.forName(driverName).newInstance();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		this.connectionUrl=connectionUrl;
		this.userName=userName;
		this.password=password;
	}

	@Override
	protected Connection create() {
		try {
			return DriverManager.getConnection(connectionUrl,userName,password);
		} catch(SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public boolean validate(Connection connection) {
		try {
			return !connection.isClosed();
		} catch(SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public void expire(Connection connection) {
		try {
			connection.close();
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
