package ArrayProblems;

import java.util.*;

public class part_4 {
//    static int[] twoSum(int[] arr, int target){
//        int n = arr.length;
//        for (int i=0;i<n-1;i++){
//            for (int j=0;j<n;j++){
//                if (arr[i] + arr[j] == target){
//                    int ans[] = {i,j};
//                    return ans;
//                }
//            }
//        }
//        int ans[] = {};
//        return ans;
//    }
//
//    static void main() {
//        int[] arr = {2,7,11,15};
//        int[] ans = twoSum(arr,18);
//        System.out.println(Arrays.toString(ans));
//    }


    public static List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();

        int n = nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        result.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    static void main() {
        int nums[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);
    }

}
