package OOPs;

public class App {
    static void main(String[] args) throws Exception {
//        System.out.println("Hello world");
        //Default constructor
//        Student A = new Student();
//        A.id = 1;
//        A.age = 20;
//        A.name = "Aditya";
//        A.nos = 3;
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.study();
//        A.sleep();

        //Parameterised constructor
//        Student A = new Student(1,12,"Aditya",3,);
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.study();
//        A.sleep();

//        Student B = new Student(A);
//        System.out.println(B.name);
//        System.out.println(B.age);
//        System.out.println(B.id);
//        System.out.println(B.nos);

        //Encapsulation
        Student A = new Student(1,12,"Aditya",3,"Tina");
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);
//        System.out.println(A.gf);

        A.bunk();
        A.study();
        A.sleep();
//        A.gfChatting();
    }
}
