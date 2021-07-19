package mediatorPattern;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class SaveButton extends JButton implements Component {

	private Mediator mediator;

	public SaveButton() {
		super("Save");
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	protected void fireActionPerformed(ActionEvent actionEvent) {
		mediator.saveChanges();
	}

	@Override
	public String getName() {
		return "Save Button";
	}

}