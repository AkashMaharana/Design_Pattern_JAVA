package statePattern;

public abstract class State {

	private Player player;

	public State(Player player) {
		this.setPlayer(player);
	}

	public abstract String onLock();

	public abstract String onPlay();

	public abstract String onNext();

	public abstract String onPrevious();

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

}
