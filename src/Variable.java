import jdk.swing.interop.LightweightContentWrapper;

public class Variable {
    static void main(){

//        create // declare
        int age;
//        System.out.println(age);
//        assign value
        age = 10;
        age = 11;
        System.out.println(age);

//        define or initialize
        int totalmarks = 20;
        System.out.println(totalmarks);

//        Case Sensitive
        int weight = 80;
        int WEIGHT = 90;
        System.out.println("weight:" + weight);
        System.out.println("WEIGHT:" + WEIGHT);

//        Starting Letter
        int marks = 10;
        int MARKS = 11;
        int _marks = 12;
        int $marks = 13;

//        Subsequent Letters
        int height5 = 21;
        int height_love = 33;
        int height$love = 44;
        int height_ = 66;
        int height$ = 55;

//        No Reserved Keywords
//        int class = 22;

//        length
        int hellojikaisehosareMyNameIsAdityaSingh = 101;
        int a = 1;
        int b = 2;
        int c = 3;

//        camelCase
        int myNameIsAdityaSingh = 52;
//        int totalMarks = 100;

//        constants
        int DAYS_IN_YEAR = 365;
    }

}
