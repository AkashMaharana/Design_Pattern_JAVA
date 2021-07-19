package statePattern;

public class Application {
	
	public static void main(String[] args) {
        Player player = new Player();
        PlayingControl playingControl = new PlayingControl(player);
        playingControl.init();
    }

}
