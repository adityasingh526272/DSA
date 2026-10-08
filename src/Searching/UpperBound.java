package Searching;

public class UpperBound {
    static int getUpperBound(int arr[], int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        while (s <= e){
            int mid = s + (e-s)/2;

            if (arr[mid] <= target){
                //move to right
                s = mid + 1;
            }
            else {
                //arr[mid] > target
                //ans store
                ans = mid;
                //move left
                e = mid - 1;
            }
        }
        return ans;
    }

    static void main() {
        int arr[] = {10,20,30,40,50,60,70,80};
        int ans = getUpperBound(arr,55);
        System.out.println(ans);
    }
}
