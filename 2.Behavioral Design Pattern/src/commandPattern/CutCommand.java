package commandPattern;

public class CutCommand extends Command {

	public CutCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		if (this.getEditor().textField.getSelectedText().isEmpty()) {
			return false;
		}
		backup();
		String source = this.getEditor().textField.getText();
		this.getEditor().clipboard = this.getEditor().textField.getSelectedText();
		this.getEditor().textField.setText(cutString(source));
		return true;
	}

	private String cutString(String source) {
		String start = source.substring(0, this.getEditor().textField.getSelectionStart());
		String end = source.substring(this.getEditor().textField.getSelectionEnd());
		return start + end;
	}
}
