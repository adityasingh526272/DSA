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
//    static int[] multiplyBy10(int[] arr){
//        int size = arr.length;
//        int newArray[] = new int[size];
//
//        for (int i=0;i<size;i++){
//            int element = arr[i];
//            int newElement = element * 10;
//            newArray[i] = newElement;
//        }
//        //return updated array
//        return newArray;
//    }
//    static void main() {
//        int arr[] = {1,2,5,3,6};
//        int ans[] = multiplyBy10(arr);
//        System.out.println("Printing ans array : ");
//        for (int i:ans){
//            System.out.println(i);
//        }
//    }

    //Question-3
//    static boolean findTarget(int arr[], int target){
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==target){
//                return true;
//            }
//        }
//        //agar poora array travel ho chuka h
//        //aur ek baar bhi target nhi mila
//        //to target array me present nhi h
//        //return false
//        return false;
//    }
//    static void main() {
//        int arr[] = {1,3,5,7,9};
//        boolean ans = findTarget(arr,9);
//        System.out.println(ans);
//    }

    //Question-4
//    static int getMaximum(int arr[]){
//        int max = arr[0];
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]>max){
//                max = arr[i];
//            }
//        }
//        //jab mai yaha pahchunga toh poora array compare ho chuka hoga
//        //and maxi ke andar sabse badi value hogi
//        return max;
//    }
//
//    static void main() {
//        int arr[] = {5,9,3,10,14};
//        System.out.println(getMaximum(arr));
//    }

    //Question-5
//    static int[] getPosNegSum(int arr[]){
//        int posSum = 0;
//        int negSum = 0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]>0){
//                //num is positive
//                posSum = posSum + arr[i];
//            }
//            else {
//                //num is negative
//                negSum = negSum + arr[i];
//            }
//        }
//        int ans[] = {posSum, negSum};
//        return ans;
//    }
//
//    static void main() {
//        int arr[] = {5,-9,-3,10,-14,15};
//        int ans[] = getPosNegSum(arr);
//        System.out.println("Positive sum = " + ans[0]);
//        System.out.println("Negative sum = " + ans[1]);
//    }

    //Question-6
    static int[] getZeroOneCount(int arr[]){
        int zeroCount = 0;
        int oneCount = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == 0){
                zeroCount++;
            }
            else {
                //arr[i]=1
                oneCount++;
            }
        }
        int ans[] = {zeroCount, oneCount};
        return ans;
    }

    static void main() {
        int arr[] = {1,0,1,0,0,1,1,0};
        int ans[] = getZeroOneCount(arr);
        System.out.println("Zero count = " + ans[0]);
        System.out.println("One count = " + ans[1]);
    }
}
