public class Demo08 {
    public static void main(String[] args) {
        Pedalable cycle = new Bicycle("Bicycle");
        //v.startEngine(); // crash
        cycle.pedal(10);
    }
}
