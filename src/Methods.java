public class Methods {
//    Declaration
//    static void printtableof2(){
//        for (int i=1;i<=10;i++){
//            int ans = 2*i;
//            System.out.println(ans);
//        }
//    }

//    static void printsum(int x, int y){
//        System.out.println("Sum : " + (x+y));
//    }

//    static void printMultiplication(int a, int b){
//        int ans = a*b;
//        System.out.println("result : " + ans);
//    }

    static int add(int p, int q){
        int sum = p+q;
        return sum;
    }

    static void main() {
//        Method call
//        printtableof2();
//        printsum(4,6);
//        printMultiplication(5,14);
        int result = add(5,8);
        System.out.println("Result : " + result);
    }
}
