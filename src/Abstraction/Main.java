package Abstraction;

//abstract class Bird{
//    abstract void fly();
//    abstract void eat();
//
//    public void sleep(){
//        System.out.println("Bird sleeping");
//    }
//}
//
//class Sparrow extends Bird{
//
//    @Override
//    void fly() {
//        System.out.println("Sparrow flying");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Sparrow eating...");
//    }
//}
//
//class Crow extends Bird{
//
//    @Override
//    void fly() {
//        System.out.println("Crow flying..");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Crow eating...");
//    }
//}

//Interface
interface Bird{
    void fly();
    void eat();
    default void sleep(){
        System.out.println(" bird sleeping");
    }
}
interface Walk{
    void walking();
}

class Sparrow implements Bird, Walk{


    @Override
    public void fly() {
        System.out.println("Sparrow flying..");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eating...");
    }

    @Override
    public void walking() {
        System.out.println("Sparrow walking");
    }
}
class Crow implements Bird, Walk{

    @Override
    public void fly() {
        System.out.println("Crow flying..");
    }

    @Override
    public void eat() {
        System.out.println("Crow eating...");
    }

    @Override
    public void walking() {
        System.out.println("Crow walking");
    }
}
public class Main {
    static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.eat();
        b.fly();
        b.sleep();
    }
    static void main() {
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
//        Bird b = new Sparrow();
//        b.eat();
//        b.fly();
//
//        Crow c = new Crow();
//        c.eat();
//        c.fly();
    }
}
