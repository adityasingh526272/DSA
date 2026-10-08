package Searching;

public class NoOfOccurence {
    static int getLowerBound(int arr[], int taget){
        int n = arr.length;
        int s = 0;
        int e = n-1;
//        int ans = -1;
        int ans = n;
        while (s<=e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] >= taget){
                //ans store
                ans = mid;
                //move to left
                e = mid - 1;
            }
            else {
                //right move
                s = mid + 1;
            }
        }
        return ans;
    }

    static int getUpperBound(int arr[], int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
//        int ans = -1;
        int ans = n;
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

    static int countFreq(int[] arr, int target){
        int lbIndex = getLowerBound(arr, target);
        int upIndex = getUpperBound(arr, target);
        int ans = upIndex - lbIndex;
        return ans;
    }

    static void main() {
//        int arr[] = {10,20,40,40,40,60,70,80};
        int arr[] = {5,6,7,8,9};
        int ans = countFreq(arr,40);
        System.out.println(ans);
    }
}
