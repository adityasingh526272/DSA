package ArrayProblems;

public class ArrayManipulation {
    //Question-1
//    static void reverseArray(int arr[]){
//        int n = arr.length;
//        int i=0;
//        int j=n-1;
//        while (i<=j){
//            //swap
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            //i ko aage badhao
//            i++;
//            //j ko niche laao
//            j--;
//        }
//        //now your array has been reversed
//        //print
//        for (int k:arr){
//            System.out.println(k);
//        }
//    }
//
//    static void main() {
//        int arr[] = {5,6,8,2,9};
//        reverseArray(arr);
//    }

    //Question-2
    static void shiftBy1(int[] arr){
        //Step-1: store last wale ki value
        int n = arr.length;
        int temp = arr[n-1];
        //Step-2: shift all values of array
        for (int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        //Step-3: temp ki value ko 0 index pe copy
        arr[0] = temp;
    }

    static void main() {
        int arr[] = {5,6,8,2,9};
        shiftBy1(arr);
        for (int a: arr){
            System.out.print( a + " ");
        }
        System.out.println();
    }
}
