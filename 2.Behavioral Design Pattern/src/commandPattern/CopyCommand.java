package commandPattern;

public class CopyCommand extends Command {

	public CopyCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		this.getEditor().clipboard = this.getEditor().textField.getSelectedText();
		return false;
	}

}
