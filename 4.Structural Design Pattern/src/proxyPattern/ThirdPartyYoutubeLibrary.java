package proxyPattern;

import java.util.Map;

public interface ThirdPartyYoutubeLibrary {

	public Map<String, Video> popularVideos();

	public Video getVideos(String videoId);

}
