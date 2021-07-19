package facadePattern;

import java.io.File;

public class AudioMixer {

	public File fix(VideoFile videoFile) {
		System.out.println("AudioMixer : Fixing Audio");
		return new File("temp");
	}

}
