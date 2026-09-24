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


//    public static List<List<Integer>> threeSum(int[] nums) {
//
//        Set<List<Integer>> result = new HashSet<>();
//
//        int n = nums.length;
//        for(int i=0;i<n-2;i++){
//            for(int j=i+1;j<n-1;j++){
//                for(int k=j+1;k<n;k++){
//                    if(nums[i] + nums[j] + nums[k] == 0){
//                        List<Integer> temp = new ArrayList<>();
//                        temp.add(nums[i]);
//                        temp.add(nums[j]);
//                        temp.add(nums[k]);
//                        Collections.sort(temp);
//                        result.add(temp);
//                    }
//                }
//            }
//        }
//        return new ArrayList<>(result);
//    }
//
//    static void main() {
//        int nums[] = {-1,0,1,2,-1,-4};
//        List<List<Integer>> ans = threeSum(nums);
//        System.out.println(ans);
//    }


//    public static int removeDuplicates(int[] nums) {
//        int i = 0;
//        int j = 1;
//        int n = nums.length;
//        while(j<n){
//            if(nums[i] == nums[j]){
//                j++;
//            }
//            else{
//                //no match
//                i++;
//                nums[i] = nums[j];
//                j++;
//            }
//        }
//        return i+1;
//    }
//
//    static void main() {
//        int[] nums = {1,1,2};
//        int k = removeDuplicates(nums);
//
//        System.out.println("Number of unique elements: " + k);
//
//        for (int x = 0; x < k; x++) {
//            System.out.print(nums[x] + " ");
//        }
//    }


    public static int findFirstRepeatingElement(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();
        //freq store
        for (int num: arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int i: arr){
            if (freq.get(i) > 1){
                return i;
            }
        }
        //agar koi bhi freq >1 nahi h
        return -1;
    }

    static void main() {
        int[] arr = {3,2,2,2,3,2,2};
        System.out.println(findFirstRepeatingElement(arr));
    }

}
