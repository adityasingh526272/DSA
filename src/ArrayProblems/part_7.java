package ArrayProblems;

import java.util.ArrayList;
import java.util.List;

public class part_7 {
    //print the sum of each row in a 2D array
//    public static List<Integer> rowSums(int[][] arr){
//        List<Integer> result = new ArrayList<>();
//        int m = arr.length;
//        int n = arr[0].length;
//        //traversal
//        for (int row=0;row<m;row++){
//            //jaise hi mai kisi nayi row me aaunga
//            //waise hi mai sum=0 kardunga
//            int sum = 0;
//            for (int col=0;col<n;col++){
//                int value = arr[row][col];
//                sum = sum + value;
//            }
//            //jab mai saare column ki travel and add kr chuka hounga
//            //tab mere pass sum wale variable me entire row ka sum ready hoga
//            result.add(sum);
//        }
//        return  result;
//    }
//
//    static void main() {
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(rowSums(arr));
//    }


    //print the sum of each column of 2D array
//    public static List<Integer> columnSums(int[][] arr){
//        List<Integer> result = new ArrayList<>();
//        int m = arr.length;
//        int n = arr[0].length;
//        //traversal
//        for (int col=0;col<m;col++){
//            //jaise hi mai kisi nayi column me aaunga
//            //waise hi mai sum=0 kardunga
//            int sum = 0;
//            for (int row=0;row<n;row++){
//                int value = arr[row][col];
//                sum = sum + value;
//            }
//            //jaise hi main ek column me entire traversal krke sum nikal chuka hounga
//            //tab main us sum ko result me store krdunga
//            result.add(sum);
//        }
//        return  result;
//    }
//
//    static void main() {
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(columnSums(arr));
//    }


    //Wave print A Matrix
    public static List<Integer> wavePrintMatrix(int[][] matrix, int m, int n){
        List<Integer> result = new ArrayList<>();

        //lets move column wise
        for (int col=0;col<n;col++){
            //hr ek column index ko chexk kro for even/odd
            if ((col & 1) == 1){
                //add
                //bottom to top
                for (int row=m-1;row>=0;row--){
                    result.add(matrix[row][col]);
                }
            }
            else {
                //even
                //top to bottom
                for (int row=0;row<m;row++){
                    result.add(matrix[row][col]);
                }
            }
        }
        return result;
    }

    static void main() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int m = matrix.length;
        int n = matrix[0].length;
        System.out.println(wavePrintMatrix(matrix,m,n));
    }
}
