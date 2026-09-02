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
    static int sumOfDigits(int num){
        // agar mere num=0, toh mai ruk jaunga
        // agar mere num!=0, toh main processing krta hu
        int sum =0;
        while (num != 0){
            int digit = num % 10;
            sum = sum +digit;
            //last digit remove
            num = num/10;
        }
        return sum;
    }
    static int reverseNumber(int num){
        int revNum = 0;
        //ans = ans*10 + currentDigit
        while (num != 0){
            int digit = num % 10;
            //reverse num calculate as per formula
            revNum = revNum*10+digit;
            //last digit remove krna padega number se
            num = num/10;
        }
        return revNum;
    }

    static boolean isPalindrome(int num){
        int originalNum = num;
        int reversedNum = reverseNumber(num);
        if (originalNum == reversedNum){
            System.out.println("It is a palindrome");
            return true;
        }else {
            System.out.println("It is not a palindrome");
            return false;
        }
    }
    static boolean isPrimeOrNot(int num){
        for (int i=2;i*i<=num;i++){
//        for (int i=2;i<=num-1;i++){
            if (num%i == 0){
                //not a prime
                return false;
            }
        }
        //yaha tabhi pahuch paoge, jab loop se bahar nikloge
        //or loop se tabhi bahar nikloge, jab kabhi bhi
        //remainder mein zero na aaye
        //or agar kabhi remainder zero nhi aaya
        //iska mtlb its a prime number
        return true;
    }

    static int getGCD(int a, int b){
        //gcd(a,b) = gcd(b, a%b);

        while (b != 0){
            int oldvalueOfb = b;
            b = a%b;
            a = oldvalueOfb;
        }
        //jab mera b 0 hoga, tab a ki place pr gcd milega
        int ans = a;
        return ans;
    }

    static int getLCM(int a, int b){
        int gcd = getGCD(a,b);
        //gcd(18,12) = 6
        int prod = a*b;
        //prod(a,b) -> 216
        int lcm = prod/gcd;
        //216/6
        return lcm;
    }

    static boolean isArmstrongNUmber(int num){
        int sum = 0;
        int originalNum = num;
        while(num != 0){
            int digit = num % 10;
            int cubeOfdigit = digit*digit*digit;
            sum = sum + cubeOfdigit;
            //digit remove from num
            num = num/10;
        }
        if (sum == originalNum){
            return true;
        }
        else {
            return false;
        }
    }

    static boolean checkPerfectNumber(int num){
        int sum = 1;
        for (int i=2;i*i<=num;i++){
            if (num % i == 0){
                // i ne num ko perfectly divide kr diyA H
                //toh ab pair factor kya banega
                //1st factor -> i
                //2nd factor -> num/i
                int firstFactor = i;
                int secondFactor = num/i;
                sum = sum + firstFactor + secondFactor;
            }
        }
        if (sum == num){
            return true;
        }
        else {
            return false;
        }
    }

    static void printAllNumber(int n){
        //print all prime number from 1 to N
        //1 is not a prime number
        for (int num=2;num<=n;num++){
            boolean isPrime = isPrimeOrNot(num);
            if (isPrime == true){
                System.out.println(num);
            }
        }

        //check whether a number is prime or not
//        int num = 5;
//        for (int i=2;i*i<=num;i++){
//            if (num%i==0){
//                return false;
//            }
//        }
//        return true;
    }

        static void main() {
        printAllNumber(100);
//            System.out.println(checkPerfectNumber(7));
//            System.out.println(isArmstrongNUmber(153));
//            System.out.println(getLCM(24,65));
//            System.out.println(getGCD(12,18));
//        int num = 11;
//        System.out.println(isPrimeOrNot(num));
//        boolean ans = isPalindrome(1221);
//        System.out.println(ans);
//        int num = 53127;
//        int ans = reverseNumber(num);
//        System.out.println(ans);
//        int ans = sumOfDigits(num);
//        int ans = countDigits(num);
//        System.out.println(ans);
//        printDigits(num);
    }
}
