package ArrayProblems;

import java.util.HashMap;

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
//    static void shiftBy1(int[] arr){
//        //Step-1: store last wale ki value
//        int n = arr.length;
//        int temp = arr[n-1];
//        //Step-2: shift all values of array
//        for (int i=n-1;i>0;i--){
//            arr[i] = arr[i-1];
//        }
//        //Step-3: temp ki value ko 0 index pe copy
//        arr[0] = temp;
//    }
//
//    static void main() {
//        int arr[] = {5,6,8,2,9};
//        shiftBy1(arr);
//        for (int a: arr){
//            System.out.print( a + " ");
//        }
//        System.out.println();
//    }

    //Question-3
//    static void printAlternate(int arr[]){
//        int n = arr.length;
//        int i = 0;
//        int j = n-1;
//        while (i<=j){
//            if (i==j){
//                System.out.println(arr[i]);
//                return;
//            }
//            else {
//                // i<j
//                System.out.println(arr[i]);
//                i++;
//                System.out.println(arr[j]);
//                j--;
//            }
//        }
//    }
//
//    static void main() {
//        int arr[] = {1,2,3,4,5,6};
//        printAlternate(arr);
//    }

    //Question-4
//    static int getMode(int arr[]){
//        HashMap<Integer,Integer> freq = new HashMap<>();
//
//        for (int num: arr){
//            freq.put(num, freq.getOrDefault(num,0) + 1);
//        }
////        for (int i: freq.keySet()){
////            //i-> will represent key
////            System.out.println(i + " -> " + freq.get(i));
////        }
//
//        int maxFreq = -1;
//        int maxFreqWaliKey = -1;
//
//        for (int key: freq.keySet()){
//            int currentKey = key;
//            int currentKeyKiFrequency = freq.get(key);
//            if (currentKeyKiFrequency > maxFreq){
//                //mujhe naya max mil gaya
//                maxFreq = currentKeyKiFrequency;
//                maxFreqWaliKey = currentKey;
//            }
//        }
//        //jab loop se bahar aaoge toh max freq wali key ready hogi
//        return maxFreqWaliKey;
//    }
//
//    static void main() {
//        int arr[] = {1,1,2,2,2,3,3,3,3,4,4,4,4,4,5,5};
//        int ans = getMode(arr);
//        System.out.println(ans);
//    }

    //Question-5
   static int[] getHighestLowestFreqElement(int arr[]){
       HashMap<Integer,Integer> freq = new HashMap<>();
    //insert Data
       for (int num:arr){
           freq.put(num, freq.getOrDefault(num,0) + 1);
       }
       //hashmap is ready
       int highestFreq = Integer.MIN_VALUE;
       int highestNum = -1;
       for (int key: freq.keySet()){
           int currentKey = key;
           int currentfreq = freq.get(key);
           if (currentfreq > highestFreq){
               //highest ko update krna chaiye
               highestFreq = currentfreq;
               highestNum = currentKey;
           }
       }
       int lowestFreq= Integer.MAX_VALUE;
       int lowestNum = -1;
       for (int key: freq.keySet()) {
           int currentKey = key;
           int currentfreq = freq.get(key);
           if (currentfreq < lowestFreq) {
               //it's time to update
               lowestFreq = currentfreq;
               lowestNum = currentKey;
           }
       }
       int ans[] = {highestNum, lowestNum};
       return ans;
   }

    static void main() {
        int arr[] = {1,2,2,2,3,3,3,3,4,4,4,4,4,5,5};
        int ans[] = getHighestLowestFreqElement(arr);
        System.out.println("highest freq wala num : " + ans[0]);
        System.out.println("lowest freq wala num : " + ans[1]);
    }
}
