package com.example.video;
    
public class VideoPipelineFacade {
    private final Decoder dec;
    private final FilterEngine fe;
    private final Encoder enc;

    public VideoPipelineFacade(Decoder dec, FilterEngine fe, Encoder enc) {
        this.dec = dec;
        this.fe = fe;
        this.enc = enc;
    }

    public java.nio.file.Path process(java.nio.file.Path src, java.nio.file.Path out, boolean gray, Double scale, Integer sharpenStrength){
        Frame[] frames = dec.decode(src);
        frames = fe.grayscale(frames);
        frames = fe.scale(frames, scale);
        return enc.encode(frames, out);
    }
}
