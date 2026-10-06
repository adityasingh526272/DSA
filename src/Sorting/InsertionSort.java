package Sorting;

public class InsertionSort {
    static void insertionSort(int arr[]){
        int n = arr.length;
        for (int i=1;i<n;i++){
            int curr = i;
            int prev = i-1;
            int curValue = arr[i];
            //shifting
            while (prev>=0 && curValue<arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //ab hamare pass ek khali jagah aa chuki h
            //place the current value
            arr[prev+1] = curValue;
        }
    }

    static void main() {
        int arr[] = {9,5,2,8,6};
        insertionSort(arr);
        System.out.println("Printing the array:");
        for (int value: arr) {
            System.out.print(value + " ");
        }
    }
}
