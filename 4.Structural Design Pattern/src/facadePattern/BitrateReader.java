package facadePattern;

public class BitrateReader {

	public static VideoFile read(VideoFile videoFile, Codec codec) {
		System.out.println("BitreateReader : Reading " + videoFile.getCodecType().toUpperCase() + " File");
		return videoFile;
	}

	public static VideoFile convert(VideoFile videoFile, Codec codec) {
		String name = videoFile.getCodecType().equals("avi") ? "mpeg4" : "avi";
		System.out.println("BitreateReader : Converting " + videoFile.getCodecType().toUpperCase() + " File to "
				+ name.toUpperCase());
		return videoFile;
	}

}
