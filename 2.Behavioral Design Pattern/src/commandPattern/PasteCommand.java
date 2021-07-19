package commandPattern;

public class PasteCommand extends Command {

	public PasteCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		if (this.getEditor() == null || this.getEditor().clipboard.isEmpty()) {
			return false;
		}
		backup();
		this.getEditor().textField.insert(this.getEditor().clipboard, this.getEditor().textField.getCaretPosition());
		return true;
	}

}
