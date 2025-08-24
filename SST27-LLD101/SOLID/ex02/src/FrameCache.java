public class FrameCache implements Cache{

    private Frame last;
    @Override public void store(Frame f) { 
        this.last = f; 
    }
    @Override public boolean hasLast() { 
        return last != null; 
    }
    
}
