package proxyPattern;

import java.util.HashMap;
import java.util.Map;

public class YoutubeCacheProxy implements ThirdPartyYoutubeLibrary {

	private ThirdPartyYoutubeLibrary youtubeService;
	private Map<String, Video> cachePopularVideos = new HashMap<>();
	private Map<String, Video> cacheAllVideos = new HashMap<>();

	public YoutubeCacheProxy() {
		this.youtubeService = new ThirdPartyYoutubeClass();
	}

	@Override
	public Map<String, Video> popularVideos() {
		if (cachePopularVideos.isEmpty()) {
			cachePopularVideos = youtubeService.popularVideos();
		} else {
			System.out.println("Cached videos list retrieved");
		}
		return cachePopularVideos;
	}

	@Override
	public Video getVideos(String videoId) {
		Video video = cacheAllVideos.get(videoId);
		if (video == null) {
			video = youtubeService.getVideos(videoId);
			cacheAllVideos.put(videoId, video);
		} else {
			System.out.println("Retrieved video " + videoId + "from cache ");
		}
		return video;
	}
	
	public void reset() {
		cachePopularVideos.clear();
		cacheAllVideos.clear();
	}

}
