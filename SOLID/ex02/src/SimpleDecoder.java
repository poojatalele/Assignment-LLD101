public class SimpleDecoder implements Decoder{

    @Override
    public Frame decode(byte[] bytes) {
        return new Frame(bytes); 
    }
}
