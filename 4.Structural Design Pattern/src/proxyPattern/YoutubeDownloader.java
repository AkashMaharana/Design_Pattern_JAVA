package proxyPattern;

import java.util.Map;

public class YoutubeDownloader {

	private ThirdPartyYoutubeLibrary customerAPI;

	public YoutubeDownloader(ThirdPartyYoutubeLibrary customerAPI) {
		this.customerAPI = customerAPI;
	}

	public void renderVideoPage(String videoId) {
		Video video = customerAPI.getVideos(videoId);
		System.out.println("\n-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.getId());
        System.out.println("Title: " + video.getTitle());
        System.out.println("Video: " + video.getData());
        System.out.println("-------------------------------\n");
	}
	
	public void renderAllPopularVideos() {
		Map<String, Video> list = customerAPI.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on Youtube (imagine fancy HTML)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.getId() + " / Title: " + video.getTitle());
        }
        System.out.println("-------------------------------\n");
	}

}
