public class Player {
    private final Decoder decoder;
    private final Render render;
    private final FrameCache cache;

    public Player(Decoder decoder, Render render, FrameCache cache) {
        this.decoder = decoder;
        this.render = render;
        this.cache = cache;
    }

    void play(byte[] fileBytes){
        Frame f = decoder.decode(fileBytes);    
        cache.store(f);                         
        render.showPlaying(fileBytes.length); 
        render.showCacheStatus(cache.hasLast());
    }
}