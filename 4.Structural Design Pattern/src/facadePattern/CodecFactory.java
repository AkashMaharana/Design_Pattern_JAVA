package facadePattern;

public class CodecFactory {

	public static Codec extract(VideoFile videoFile) {
		String type = videoFile.getCodecType();
		if ("mpeg4".equals(type)) {
			System.out.println("Code Factory : Extracting MPEG Audio");
			return new MPEG4CompressionCodec();
		} else {
			System.out.println("Code Factory : Extracting AVI Audio");
			return new AVICompressionCodec();
		}
	}

}
