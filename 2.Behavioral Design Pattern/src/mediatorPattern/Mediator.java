package mediatorPattern;

import javax.swing.ListModel;

public interface Mediator {

	public void addNewNote(Note note);

	public void deleteNote();

	public void getInfoFromList(Note note);

	public void saveChanges();

	public void markNote();

	public void clear();

	@SuppressWarnings("rawtypes")
	public void sendToFilter(ListModel listModel);

	@SuppressWarnings("rawtypes")
	public void setElementsList(ListModel listModel);

	public void registerComponent(Component component);

	public void hideElements(boolean flag);

	public void createGUI();

}
