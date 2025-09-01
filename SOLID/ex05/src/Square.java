
public class Square implements Shape {
    private int side;

    public void resize(int side){ 
        this.side = side; 
    }
    
    public int area() {
        return side*side;
    }
}