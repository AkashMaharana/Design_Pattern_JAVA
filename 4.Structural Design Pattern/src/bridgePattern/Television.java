package bridgePattern;

public class Television implements Device{

	private boolean switchStatus=false;
	private int volume=30;
	private int channel=1;
	
	@Override
	public boolean isEnabled() {
		return switchStatus;
	}

	@Override
	public void enable() {
		switchStatus=true;
	}

	@Override
	public void disable() {
		switchStatus=false;
	}

	@Override
	public int getVolume() {
		return this.volume;
	}

	@Override
	public void setVolume(int volume) {
		if(this.volume>100) {
			this.volume=100;
		}
		else if(this.volume<0){
			this.volume=0;
		}
		else {
			this.volume=volume;
		}
	}

	@Override
	public int getChannel() {
		return this.channel;
	}

	@Override
	public void setChannel(int channelNumber) {
		this.channel=channelNumber;
	}

	@Override
	public void printStatus() {
		System.out.println("------------------------------------");
        System.out.println("| I'm Television Set.");
        System.out.println("| I'm " + (switchStatus ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
	}

}
