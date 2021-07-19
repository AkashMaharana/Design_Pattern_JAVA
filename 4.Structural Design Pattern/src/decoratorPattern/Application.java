package decoratorPattern;

public class Application {

	public static void main(String[] args) {
		String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
		String fileName = "C:\\Users\\Administrator\\OneDrive\\Desktop\\Design_Pattern\\4.Structural Design Pattern\\src"
				+ "\\decoratorPattern\\Demo.txt";

		DataSource plain = new FileDataSource(fileName);
		plain.writeData(salaryRecords);

		DataSourceDecorator compress = new CompressionDecorator(new EncryptionDecorator(new FileDataSource(fileName)));
		compress.writeData(salaryRecords);

		DataSourceDecorator encode = new EncryptionDecorator(new FileDataSource(fileName));
		encode.writeData(salaryRecords);
	}

}
