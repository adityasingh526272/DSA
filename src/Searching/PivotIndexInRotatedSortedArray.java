package Searching;

public class PivotIndexInRotatedSortedArray {
        public static int search(int[] nums, int target) {
            int n = nums.length;
            int s = 0;
            int e = n-1;
            int ans = -1;

            if(nums[s]<nums[e]){
                //no effective rotation
                return 0;
            }

            //binary search wala logic
            while(s <= e){
                int mid = s+(e-s)/2;

                if(nums[mid] <= nums[n-1]){
                    //iska mtlb hum L2 wali line pr h
                    //answer toh L1 wali pr h
                    //iska mtlb move to L1, or left
                    e = mid - 1;
                }
                else{
                    //mid mera l1 pr hi h
                    //ans store
                    ans = mid;
                    //move to right
                    s = mid + 1;
                }
            }
            return ans;
        }

    static void main() {
        int arr[] = {4,5,6,7,0,1,2};
        int ans = search(arr,6);
        System.out.println(ans);
    }
}

