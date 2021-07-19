package mediatorPattern;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class DeleteButton extends JButton implements Component {

	@SuppressWarnings("unused")
	private Mediator mediator;

	public DeleteButton() {
		super("Delete");
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	public String getName() {
		return "Delete Button";
	}

	@Override
	protected void fireActionPerformed(ActionEvent actionEvent) {
		this.mediator.deleteNote();
	}

}
