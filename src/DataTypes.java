public class DataTypes {
    static void main(){

//        Numeric DT - short, byte, int, long
        byte num1 = 127;
        System.out.println(num1);
        short num2 = 32767;
        System.out.println(num2);
        int num3 = 50000;
        long num4 = 565656512;
        System.out.println(num3);
        System.out.println(num4);

//        floating DTs
        float num5 = 3.1424f;
        System.out.println(num5);
        double num6 = 3.54664323215789;
        System.out.println(num6);

//        other - char, Boolean
        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);
        char firstCharacter = 'a';
//        System.out.println("My first charcter is : " + firstCharacter);
//        System.out.println("My first charcter is : " + (firstCharacter+2));
        System.out.println("My first charcter is : " +(char)(firstCharacter+2));

//        Implicit
        byte num7 = 127;
        long newNum = num7;
        System.out.println("new Num : " + num7);

//        Explicit
        long value1 = 1234567899;
        int value2 = (int)value1;
        System.out.println(value2);
    }
}
