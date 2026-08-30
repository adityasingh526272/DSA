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
    static int countDigits(int num){
        // agar mere num=0, toh mai ruk jaunga
        // agar mere num!=0, toh main processing krta hu
        int count =0;
        while (num != 0){
            int digit = num % 10;
            count++;
            //last digit remove
            num = num/10;
        }
        return count;
    }
    static void main() {
        int num = 53127;
        int ans = countDigits(num);
        System.out.println(ans);
//        printDigits(num);
    }
}
