package statePattern;

public class LockedState extends State{

	public LockedState(Player player) {
		super(player);
		player.setPlaying(false);
	}

	@Override
	public String onLock() {
		if(this.getPlayer().isPlaying()) {
			this.getPlayer().setState(new ReadyState(this.getPlayer()));
			return "Stop Playing";
		}
		return "Locked...";
	}

	@Override
	public String onPlay() {
		this.getPlayer().setState(new ReadyState(this.getPlayer()));
        return "Ready";
	}

	@Override
	public String onNext() {
		return "Locked....";
	}

	@Override
	public String onPrevious() {
		return "Locked...";
	}

}
