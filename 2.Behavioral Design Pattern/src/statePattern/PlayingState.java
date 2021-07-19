package statePattern;

public class PlayingState extends State {

	public PlayingState(Player player) {
		super(player);
	}

	@Override
	public String onLock() {
		this.getPlayer().setState(new LockedState(this.getPlayer()));
		this.getPlayer().setCurrentTrackAfterStop();
		return "Stop Playing";
	}

	@Override
	public String onPlay() {
		this.getPlayer().setState(new ReadyState(this.getPlayer()));
		return "Paused...";
	}

	@Override
	public String onNext() {
		return this.getPlayer().nextTrack();
	}

	@Override
	public String onPrevious() {
		return this.getPlayer().previousTrack();
	}

}
