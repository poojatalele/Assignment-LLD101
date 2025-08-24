public class Rectangle implements Shape{
    private int w,h;

    public void resize(int w, int h){ 
        this.w = w; this.h = h; 
    }
    public int area(){ 
        return w*h; 
    }
}