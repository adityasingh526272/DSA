package Transport;

//Single inheritance
//class Animal {
//    void eat() {
//        System.out.println("Eating...");
//    }
//}
//
//class Dog extends Animal {
//    void bark() {
//        System.out.println("Barking...");
//    }
//}

//Multilevel inheritance
//class Animal {
//    void eat() {
//        System.out.println("Eating...");
//    }
//}
//
//class Dog extends Animal {
//    void bark() {
//        System.out.println("Barking...");
//    }
//}
//
//class Puppy extends Dog {
//    void weep() {
//        System.out.println("Weeping...");
//    }
//}

//Hierarchical inheritance
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}

public class TypesOfInheritance {
    static void main() {
//        Dog d = new Dog();
//        d.eat();
//        d.bark();

//        Puppy p = new Puppy();
//        p.eat();
//        p.bark();
//        p.weep();

        Cat c = new Cat();
        c.eat();
        Dog d = new Dog();
        d.bark();
        c.meow();
    }
}
