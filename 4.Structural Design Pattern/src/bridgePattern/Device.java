package bridgePattern;

public interface Device {

	public boolean isEnabled();

	public void enable();

	public void disable();

	public int getVolume();

	public void setVolume(int percent);

	public int getChannel();

	public void setChannel(int channelNumber);

	public void printStatus();

}
