public class RenderOnConsole implements Render{

    @Override
    public void showPlaying(int bytesLength) {
        System.out.println("\u25B6 Playing " + bytesLength + " bytes");
    }

    @Override
    public void showCacheStatus(boolean cached) {
        System.out.println("Cached last frame? " + cached);
    }    
}
