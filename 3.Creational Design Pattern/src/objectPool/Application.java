package objectPool;

import java.sql.Connection;

public class Application {
	
	public static void main(String[] args) {
		JDBCConnectionObjectPool connectionObjectPool=
				new JDBCConnectionObjectPool("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/test", "root", "akash");
		Connection connection = connectionObjectPool.checkout();
		connectionObjectPool.checkIn(connection);
	}

}
