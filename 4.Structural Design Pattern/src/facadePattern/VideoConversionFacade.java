package facadePattern;

import java.io.File;

public class VideoConversionFacade {

	public File convertVideo(String fileName, String format) {
		System.out.println("VideoConversionFacade : Conversion Started");
		VideoFile videoFile = new VideoFile(fileName);
		Codec sourceCodec = CodecFactory.extract(videoFile);
		Codec destinationCodec;
		if ("mpeg4".equals(format)) {
			destinationCodec = new MPEG4CompressionCodec();
		} else {
			destinationCodec = new AVICompressionCodec();
		}
		VideoFile readVideoFile = BitrateReader.read(videoFile, sourceCodec);
		VideoFile intermediateResult = BitrateReader.convert(readVideoFile, destinationCodec);
		File result = new AudioMixer().fix(intermediateResult);
		System.out.println("VideoConversionFacade : Conversion completed");
		return result;
	}
}