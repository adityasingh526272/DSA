package Sorting;

public class SelectionSort {
    static void selctionSort(int arr[]){
            //outer loop for rounds
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            int minIndex = i;
            //inner loop -> comparison arr[j] and arr[index]
            for (int j=i+1;j<n;j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //jab mera comparison complete ho jayega
            //toh main minIndex wali value ko correct position pr place ke dunga
            //swal arr[i], arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    static void main() {
        int arr[] = {2,5,3,8,6};
        selctionSort(arr);
        System.out.println("Printing the array:");
        for (int value: arr) {
            System.out.print(value + " ");
        }
    }
}
