package proxyPattern;

import java.util.HashMap;
import java.util.Map;

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLibrary {

	@Override
	public Map<String, Video> popularVideos() {
		connectToServer("http://www.youtube.com");
		return getPopularVideos();
	}

	@Override
	public Video getVideos(String videoId) {
		connectToServer("http://www.youtube.com");
		return getVideo(videoId);
	}
	
	private void connectToServer(String serverName) {
		System.out.println("Connecting to server : "+serverName);
		experienceNetworkLatency();
		System.out.println("Connected to server : "+serverName);
	}
	
	private void experienceNetworkLatency() {
		int randomLatency=random(5,10);
		for(int i=0;i<randomLatency;i++) {
			try {
				Thread.sleep(100);
			} catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private int random(int min,int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}
	
	private Map<String,Video> getPopularVideos(){
		System.out.println("Downloading popular videos...");
		Map<String,Video> popularVideos=new HashMap<>();
		popularVideos.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
		popularVideos.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
		popularVideos.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
		popularVideos.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        popularVideos.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));
		return popularVideos;
	}
	
	private Video getVideo(String videoId) {
		System.out.println("Downloading video for video id : "+videoId);
		experienceNetworkLatency();
		Video video=new Video(videoId,"Kota Factory");
		System.out.println("Video downloaded for video id :"+videoId);
		return video;
	}

}
