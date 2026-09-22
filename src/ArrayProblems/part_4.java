package ArrayProblems;

import java.util.Arrays;

public class part_4 {
    static int[] twoSum(int[] arr, int target){
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n;j++){
                if (arr[i] + arr[j] == target){
                    int ans[] = {i,j};
                    return ans;
                }
            }
        }
        int ans[] = {};
        return ans;
    }

    static void main() {
        int[] arr = {2,7,11,15};
        int[] ans = twoSum(arr,18);
        System.out.println(Arrays.toString(ans));
    }



}
