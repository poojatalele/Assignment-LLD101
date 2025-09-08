package com.example.video;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) {
        // TODO: Replace all above with VideoPipelineFacade.process(...)
        VideoPipelineFacade facade = new VideoPipelineFacade(new Decoder(), new FilterEngine(), new Encoder());
        Path out = facade.process(Path.of("in.mp4"), Path.of("out.mp4"), true, 0.5, 5);
        System.out.println("Wrote " + out);
    }
}
