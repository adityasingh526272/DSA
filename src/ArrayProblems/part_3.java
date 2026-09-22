package ArrayProblems;

public class part_3 {
//    static int[] sortArray(int[] arr){
//        int n = arr.length;
//        int i = 0;
//        int j = n-1;
//        while (i<j){
//            if(arr[i] == 1 && arr[j] == 0){
//                //swap
//                arr[i] = 0;
//                arr[j] = 1;
//            }
//            if (arr[i] == 0){
//                //i ko aage badhao
//                i++;
//            }
//            if (arr[j] == 1){
//                //j ko decrement kro
//                j--;
//            }
//        }
//        return arr;
//    }
//
//    static void main() {
//        int arr[] = {0,1,0,1,0,0,0,1,1,1,0};
//        sortArray(arr);
//        for (int num: arr){
//            System.out.println(num + " ");
//        }
//    }


//    static int missingNumber(int[] arr){
//        int xorSum = 0;
//        //xor with all array elements
//        for (int n: arr){
//            xorSum = xorSum ^ n;
//        }
//        //xor with all the element in the range
//        int n = arr.length;
//        for (int i=0;i<=n;i++){
//            xorSum = xorSum ^ i;
//        }
//        //ans ajaega
//        return xorSum;
//    }
//
//    static void main() {
//        int arr[] = {1,0,2,3,4};
//        int ans = missingNumber(arr);
//        System.out.println("Missing number : " + ans);
//    }


    static int findUniqueElement(int[] arr){
        int xorSum = 0;
        for (int n: arr){
            xorSum = xorSum ^ n;
        }
        return xorSum;
    }

    static void main() {
        int arr[] = {2,4,4,5,5,6,6,3,3};
        int ans = findUniqueElement(arr);
        System.out.println("Unique Element : " + ans);
    }
}
