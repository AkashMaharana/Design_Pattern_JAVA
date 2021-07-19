package statePattern;

import java.util.List;
import java.util.ArrayList;

public class Player {

	private State state;
	private boolean isPlaying;
	private List<String> playList = new ArrayList<>();
	private int currentTrack = 0;

	public Player() {
		this.state = new ReadyState(this);
		this.setPlaying(true);
		for (int i = 0; i < 10; i++) {
			playList.add("Track " + (i + 1));
		}
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public boolean isPlaying() {
		return isPlaying;
	}

	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}

	public List<String> getPlayList() {
		return playList;
	}

	public void setPlayList(List<String> playList) {
		this.playList = playList;
	}

	public int getCurrentTrack() {
		return currentTrack;
	}

	public void setCurrentTrack(int currentTrack) {
		this.currentTrack = currentTrack;
	}

	public String startPlayBack() {
		return "Playing Track : " + playList.get(this.currentTrack);
	}

	public String nextTrack() {
		this.currentTrack++;
		if (currentTrack - playList.size() > 0) {
			currentTrack = 0;
		}
		return "Playing Track : " + playList.get(this.currentTrack);
	}

	public String previousTrack() {
		currentTrack--;
		if (currentTrack < 0) {
			currentTrack = playList.size() - 1;
		}
		return "Playing " + playList.get(currentTrack);
	}
	
	public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }

}
