public class Bicycle extends Vehicle implements Pedalable{
    public Bicycle(String type){
        super(type);
    }
    @Override
    public void pedal(int effort){ 
        System.out.println("Pedal effort " + effort); 
    }
}