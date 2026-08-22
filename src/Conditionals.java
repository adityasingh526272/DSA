import java.util.Scanner;

public class Conditionals {
    static void main(){
//        if statement
//        int price = 500;
//        if (price>=400){
//            System.out.println("profit");
//        }

//        if-else statement
//        int age = 21;
//        if (age<=18){
//            System.out.println("you are eligible to vote");
//        }
//        else {
//            System.out.println("not eligible to vote");
//        }

//        if-else-if ladder
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the marks : ");
//        int marks = sc.nextInt();
//        if (marks>=90){
//            System.out.println("Excellent");
//        } else if (marks>=75) {
//            System.out.println("Good");
//        } else if (marks>=60) {
//            System.out.println("Average");
//        } else {
//            System.out.println("Need Improvement");
//        }

//        Nested if-else
//        int age = 23;
//        char gender = 'M';
//        if (gender == 'g'){
//            System.out.println("you are a male");
//            if (age>21){
//                System.out.println("very matured person");
//            }
//            else {
//                System.out.println("you are a boy");
//            }
//        }
//        else {
//            System.out.println("you are not a male");
//            if (age>21){
//                System.out.println("matured person");
//            }
//            else {
//                System.out.println("unmatured");
//            }
//        }

//        Ternary operator
//        int streakDays = 5;
//        String status = (streakDays >=10) ? "Consistent" : "Irregular";
//        System.out.println(status);

//        Switch statement
        System.out.println("Enter the no. of day : ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }
    }
}
