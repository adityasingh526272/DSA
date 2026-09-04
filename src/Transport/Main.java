package Transport;

public class Main {
    static void main(String[] args) {
//        Car c = new Car("Maruti", "800", 4, 5, "Auto");
//        c.startEngine();
//        c.startAC();
//        c.stopEngine();
//        System.out.println(c.name);

        Motorcycle m = new Motorcycle("Bullet","600", 2, "U","Hard");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}
