package mediatorPattern;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class AddButton extends JButton implements Component {

	@SuppressWarnings("unused")
	private Mediator mediator;

	public AddButton() {
		super("Add");
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public String getName() {
		return "Add Button";
	}

	@Override
	protected void fireActionPerformed(ActionEvent actionEvent) {
		this.mediator.addNewNote(new Note());
	}

}
