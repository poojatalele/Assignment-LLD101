
public class Demo05 {
    static int areaAfterResize(Rectangle r){
        r.resize(5, 4);         
        return r.area();
    }
    static int areaAfterResize(Square s){
        s.resize(4);     
        return s.area();
    }
    public static void main(String[] args) {
        System.out.println(areaAfterResize(new Rectangle())); 
        System.out.println(areaAfterResize(new Square()));  
    }
}
