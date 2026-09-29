package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class part_5 {
    public static List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> ans = new ArrayList<>();
        //marking
        int n = nums.length;
        for (int index=0;index<n;index++){
            int value = Math.abs(nums[index]);
            int position = value-1;
            //mark kardo ye position
            if (nums[position]>0){
                nums[position] = -nums[position];
            }
        }
        //travel array and whenever you encounter a positive value, print the number at the same time
        for (int i=0;i<n;i++){
            if (nums[i]>0){
                int valueAtThisIndex = i+1;
                ans.add(valueAtThisIndex);
            }
        }
        return ans;
    }

    static void main(String[] args) {
        int[] ans = {1,4,4,5,2,2};
        List<Integer> result = findDisappearedNumbers(ans);
        System.out.println("Result : " + result);
    }
}
