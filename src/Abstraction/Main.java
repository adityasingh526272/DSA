package Abstraction;

abstract class Bird{
    abstract void fly();
    abstract void eat();
}
class Sparrow extends Bird{

    @Override
    void fly() {
        System.out.println("Sparrow flying");
    }

    @Override
    void eat() {
        System.out.println("Sparrow eating");
    }
}
class Crow extends Bird{

    @Override
    void fly() {
        System.out.println("Crow flying");
    }

    @Override
    void eat() {
        System.out.println("Crow eating");
    }
}
public class Main {
    static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();
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
