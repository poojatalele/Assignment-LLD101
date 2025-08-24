public class Eagle extends Bird implements Flyable {

    public Eagle() { 
        super("Eagle"); 
    }
    @Override public void fly() {
        System.out.println("Successful!");
    }
}
