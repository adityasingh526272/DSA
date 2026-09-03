package OOPs;

public class Student {
    //Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    //Default constructor // attributes -> garbage
    public Student(){
        System.out.println("Student Default constructor called");
    }

    //Parameterised constructor
    public Student(int id, int age, String name, int nos){
        System.out.println("Student parameterised constructor called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    //Copy constructor
    public Student( Student sourceobj){
        System.out.println("Student copy constructor called");
        this.id = sourceobj.id;
        this.age = sourceobj.age;
        this.name = sourceobj.name;
        this.nos = sourceobj.nos;
    }

    //Methods / Behaviours
    public void study(){
        System.out.println(name + " Studying");
    }
    public void sleep(){
        System.out.println(name + " Sleeping");
    }
    public void bunk(){
        System.out.println(name + " Bunking");
    }
}
