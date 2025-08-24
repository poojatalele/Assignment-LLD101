public class Demo02 {
    public static void main(String[] args) {
        Decoder decoder = new SimpleDecoder();
        Render renderer = new RenderOnConsole();
        FrameCache cache = new FrameCache();

        Player player = new Player(decoder, renderer, cache);
        player.play(new byte[]{1,2,3,4});
    }
}
