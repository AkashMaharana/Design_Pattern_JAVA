package observerPattern;

public class Application {

	public static void main(String[] args) {
		Editor editor = new Editor();
		String filePath="Demo.txt";
		editor.getEventManager().subscribe("Open", new LogOpenListener(filePath));
		editor.getEventManager().subscribe("Save", new EmailNotificationListener("admin@example.com"));
		try {
			editor.openFile("test.txt");
			editor.saveFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
