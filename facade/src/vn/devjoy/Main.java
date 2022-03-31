package vn.devjoy;

import vn.devjoy.facade.VideoConversionFacade;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
