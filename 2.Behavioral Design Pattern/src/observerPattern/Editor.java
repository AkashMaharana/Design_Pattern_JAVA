package observerPattern;

import java.io.File;

public class Editor {

	private EventManager eventManager;
	private File file;

	public Editor() {
		this.eventManager = new EventManager("Open", "Save");
	}

	public EventManager getEventManager() {
		return eventManager;
	}

	public void setEventManager(EventManager eventManager) {
		this.eventManager = eventManager;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public void openFile(String filePath) {
		this.file = new File(filePath);
		eventManager.notify("Open", file);
	}

	public void saveFile() throws Exception {
		if (this.file != null) {
			this.eventManager.notify("Save", this.file);
		} else {
			throw new Exception("Please open a file first...");
		}
	}

}
