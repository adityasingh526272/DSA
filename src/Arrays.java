public class Arrays {
    static void main() {
        int arr[];
        arr = new int[5];
        int brr[] = {10,20,30};
        int n = brr.length;
        for (int index=0; index<=n-1; index++){
            System.out.println(brr[index]);
        }
//        System.out.println("Value at 0 index : " + brr[0]);
//        System.out.println("Value at 1 index : " + brr[1]);
//        System.out.println("Value at 2 index : " + brr[2]);
    }
}
