package ArrayProblems;

public class part_6 {
    //KADANE's ALGORITHM
    public static int maxSubArray(int[] arr){
        int n = arr.length;
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            //step1: sum create krte h
            sum = sum + arr[i];
            //step2: maxi update krna h
            maxi = Math.max(maxi,sum);
            //step3: sum check krte h for negative value
            if (sum<0){
                sum = 0;
            }
        }
        return maxi;
    }

    static void main() {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
