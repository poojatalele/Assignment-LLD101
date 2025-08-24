public class Demo06 {
    public static void main(String[] args) {
        Aviary a = new Aviary();
        a.release(new Eagle());

        // new Aviary().release(new Penguin()); // compile-time error
    }
}
