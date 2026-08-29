import com.sun.source.tree.BreakTree;

import java.util.Stack;

public class Strings {
    static void main() {
//        String firstname = "Aditya";
//        String lastname = new String ("Singh");
//        System.out.println(firstname + " " + lastname);
//        System.out.println(firstname.length());
//        System.out.println(firstname.charAt(5));

//        String name1 = "Aditya";
//        String name2 = "Aditya";
//        if (name1 == name2){
//            System.out.println("Both strings are equal");
//        }else {
//            System.out.println("Both strings are not equal");
//        }

//        if (name1.equalsIgnoreCase(name2)){
//            System.out.println("Both strings are equal");
//        }else {
//            System.out.println("Both strings are not equal");
//        }

//        if (name1.equals(name2)){
//            System.out.println("Both strings are equal");
//        }else {
//            System.out.println("Both strings are not equal");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Provide the string content : ");
//        String str = sc.nextLine();
//        System.out.println("Value : " + str);
//
//        System.out.println("Provide the string content : ");
//        String str1 = sc.next();
//        System.out.println("Value of next : " + str1);

//        String str = "Aditya";
//        System.out.println(str.length());
//        System.out.println(str.charAt(0));
//        String name = "ADITYA";
//        System.out.println(str==name);
//        System.out.println(str.equals(name));
//        System.out.println(str.equalsIgnoreCase(name));

//        empty - > length = 0
//        blank - > empty or sirf spaces h string
//        String str = " ";
//        System.out.println(str.length());
//        System.out.println(str.isEmpty());
//        System.out.println(str.isBlank());
//        String name = "  Aditya  ";
//        System.out.println(name.length());
//        name.trim();
//        System.out.println(name.length());
//        String name = "aditya";
//        System.out.println(name.toUpperCase());
//        String name1 = "ADITYA";
//        System.out.println(name.toLowerCase());

//        String str = "My name is Aditya Singh";
        //0 -> M
        //1 -> Y
        //2 -> space and so on
        //beginIndex -> 3 -> inclusive
        //endIndex -> 6 -> exclusive
//        System.out.println(str.substring(3,6));
//        System.out.println(str.contains("aadi"));

//        int num = 5153;
//        String str = String.valueOf(num);
//        System.out.println(num+1);
//        System.out.println(str + 1);

//        String name = "Aditya Singh CSE";
//        System.out.println(name.startsWith("Aditya"));
//        System.out.println(name.endsWith("cse"));

//        String name = "Aditya";
//        char [] crr = name.toCharArray();
//
//        //print the char array
//        for (char ch : crr){
//            System.out.println("Value of char : " + ch);
//        }

        //split -> output -> String array
//        String input = "My, name, is, Aditya, Singh";
//        String[] words = input.split(",");
//        for (String str : words){
//            System.out.println(str);
//        }

//        String name = "babbar";
//        name = name.replace('b', 'l');
//        System.out.println(name);

        String str = "bjcsbhdkjch";
        System.out.println(isPalindrome(str));
//        System.out.println(reverseString(str));
//        printString(str);
//        System.out.println(getLengthOfString(str));
//        System.out.println(getCountVowels(str));
    }

    static String reverseString(String str){
        String reverse = "";
        int n = str.length();
        for (int i=n-1;i>=0;i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }

    static boolean isPalindrome(String str) {
        String original = str;
        String reverse = reverseString(original);

        // compare
        for (int i = 0; i < original.length(); i++) {
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);

            if (ch1 != ch2) {
                return false;
            }
        }
        //loop se bahar main tabhi aaunga
        //jab saare character match kr rhe honge
        //iska mtlb return true
        return true;
    }


    static void printString(String str){
        int n = str.length();
        for (int i=0;i<n;i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    static int getLengthOfString(String str){
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
    }

    static int getCountVowels(String str){
        int count=0;
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                count++;
            }
        }
        return count;
    }
}
