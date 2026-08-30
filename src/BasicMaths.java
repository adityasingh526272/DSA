public class BasicMaths {
    static void printDigits(int num){
        // agar mere num=0, toh mai ruk jaunga
        // agar mere num!=0, toh main processing krta hu
        while (num != 0){
            int digit = num % 10;
            System.out.println(digit);
            //last digit remove
            num = num/10;
        }
    }
    static void main() {
        int num = 53127;
        printDigits(num);
    }
}
