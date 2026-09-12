package BitwiseOperator;

public class Main {
    static void main() {
//        int a = 5;
//        int b = 6;
//        System.out.println(a & b); //Bitwise AND
//        System.out.println(a | b); //Bitwise OR
//        System.out.println(a ^ b); //Bitwise XOR
//        System.out.println(~a);    //Bitwise NOT

//        int n = 1;
//        for (int i=1;i<=32;i++){
//            n = n << 1; //Left Shift
//            System.out.println(n);
//            System.out.println();
//        }

//        int n = 100;
//        for (int i=1;i<=10;i++){
//            n = n >> 1; //Right Shift
//            System.out.println(n);
//            System.out.println();
//        }

//        int n = 11;
//        if ((n&1) == 0){
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }

//        int n = 16;
//        if ((n & (n - 1)) == 0){
//            System.out.println("Power of 2");
//        } else {
//            System.out.println("Not power of two");
//        }

//        int n = 5;
//        int count = 0;
//        while (n != 0){
//            if ((n&1) != 0){
//                //mujhe ek set bit milegi
//                count ++;
//            }
//            //right shift to remove this bit
//            n = n >> 1;
//        }
//        System.out.println("Set bit count : " + count);

        int n = 10; //Problem
        System.out.println((n&(n-1)));
        System.out.println(n&(-n));
    }
}
