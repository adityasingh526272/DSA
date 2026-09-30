package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class part_7 {
    //print the sum of each row in a 2D array
    public static List<Integer> rowSums(int[][] arr){
        List<Integer> result = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        //traversal
        for (int row=0;row<m;row++){
            //jaise hi mai kisi nayi row me aaunga
            //waise hi mai sum=0 kardunga
            int sum = 0;
            for (int col=0;col<n;col++){
                int value = arr[row][col];
                sum = sum + value;
            }
            //jab mai saare column ki travel and add kr chuka hounga
            //tab mere pass sum wale variable me entire row ka sum ready hoga
            result.add(sum);
        }
        return  result;
    }

    static void main() {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(rowSums(arr));
    }
}
