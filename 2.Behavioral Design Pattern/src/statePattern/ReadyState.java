package statePattern;

public class ReadyState extends State{

	public ReadyState(Player player) {
		super(player);
	}

	@Override
	public String onLock() {
		this.getPlayer().setState(new LockedState(this.getPlayer()));
		return "Locked...";
	}

	@Override
	public String onPlay() {
		String action=this.getPlayer().startPlayBack();
		this.getPlayer().setState(new PlayingState(this.getPlayer()));
		return action;
	}

	@Override
	public String onNext() {
		return "Locked...";
	}

	@Override
	public String onPrevious() {
		 return "Locked...";
	}

}
