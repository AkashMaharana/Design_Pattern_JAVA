package facadePattern;

import java.io.File;

public class Application {

	public static void main(String[] args) {
		VideoConversionFacade converter = new VideoConversionFacade();
		File convertVideo = converter.convertVideo("facadeDesignPattern.avi", "mpeg4");
		System.out.println("New output file name : "+convertVideo);
	}

}
