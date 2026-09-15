package ArrayProblems;

public class Main {
    //Question-1
//    static double getAverage(int[] arr){
//        double sum = 0;
//        for (int i : arr){
//            sum +=i;
//        }
//        int size = arr.length;
//        double avg = sum/size;
//        return avg;
//    }
//
//    static void main() {
//        int[] arr={5,8,6,3,2};
//        System.out.println(getAverage(arr));
//    }

    //Question-2
    static int[] multiplyBy10(int[] arr){
        int size = arr.length;
        int newArray[] = new int[size];

        for (int i=0;i<size;i++){
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
        //return updated array
        return newArray;
    }
    static void main() {
        int arr[] = {1,2,5,3,6};
        int ans[] = multiplyBy10(arr);
        System.out.println("Printing ans array : ");
        for (int i:ans){
            System.out.println(i);
        }
    }
}
