package commandPattern;

public abstract class Command {

	private Editor editor;
	private String backup;

	public Command(Editor editor) {
		this.editor = editor;
	}

	public Editor getEditor() {
		return editor;
	}

	public void setEditor(Editor editor) {
		this.editor = editor;
	}

	public String getBackup() {
		return backup;
	}

	public void setBackup(String backup) {
		this.backup = backup;
	}

	public void backup() {
		this.backup = editor.textField.getText();

	}

	public void undo() {
		this.editor.textField.setText(this.backup);
	}

	public abstract boolean execute();

}
