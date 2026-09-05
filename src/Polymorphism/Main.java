package Polymorphism;

public class Main {
    static void main() {
//        Calculator c = new Calculator();
//        System.out.println(c.add(2,3));
//        System.out.println(c.add(2,3,5));
//        System.out.println(c.add(2,3,6,5.6));

        //Runtime Polymorphism
//        Circle c = new Circle();
//        doDrawingStuff(c);
//
//        Rectangle r = new Rectangle();
//        r.draw();
//        doDrawingStuff(r);
//
//        Shape s = new Shape();
//        doDrawingStuff(s);

        //DownCasting
        Circle c = new Circle();
        doDrawingStuff(c);

//        Rectangle r = new Rectangle();
//        doDrawingStuff(r);
    }
    public static void doDrawingStuff(Shape s){
        s.draw();  //polymorphic

        Circle c = (Circle)s;  //DownCasting
        c.personal();
    }
}
