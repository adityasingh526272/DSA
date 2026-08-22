import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
    static void main(){
//        int a = 5;
//        int b = 6;
//        System.out.println(a+b);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for firstnum:");
        int firstnum = sc.nextInt();
        System.out.println("Enter the value for secondnum:");
        int secondnum = sc.nextInt();
        int ans = firstnum + secondnum;
        System.out.println("Answer is:" + ans);

        BigInteger bg = sc.nextBigInteger();
        System.out.println("BigInteger : " + bg);

        System.out.println("Enter the  value for flag");
        boolean flag = sc.nextBoolean();
        System.out.println("Enter the value for shortval");
        short shortval = sc.nextShort();
        System.out.println("Enter the valur for floatvalue");
        float floatvalue = sc.nextFloat();

        System.out.println("Flag is : " + flag);
        System.out.println("shortval is : " + shortval);
        System.out.println("floatvalue is : " + floatvalue);

        sc.close();
    }
}
