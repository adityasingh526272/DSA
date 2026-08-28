import java.util.Scanner;

public class Arrays {
    static void main() {

//        int arr[];
//        arr = new int[5];
//        int brr[] = {10,20,30};
//        int n = brr.length;
//        for (int val: brr){
//            System.out.println(val);
//        }

//        for (int index=0; index<=n-1; index++){
//            System.out.println(brr[index]);
//        }

//        System.out.println("Value at 0 index : " + brr[0]);
//        System.out.println("Value at 1 index : " + brr[1]);
//        System.out.println("Value at 2 index : " + brr[2]);

//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        for (int i=0;i<=n-1;i++){
//            System.out.println("Provide input for index : " + i);
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("your array contains : ");
//        for (int val: arr){
//            System.out.println(val);
//        }

//        int arr[] = {12,15,56};
//        for (int val: arr){
//            System.out.println(val);
//        }

//        int arr[] = {12,13,15,11,16};
//        int sum = 0;
//        int n = arr.length;
//
//        for (int i=0;i<=n-1;i++){
//            int value = arr[i];
//            sum = sum + value;
//        }
//        System.out.println(sum);

//        int arr[] = {12,2,5,6,10};
//        int ans = 1;
//        int n = arr.length;
//
//        for (int i=0;i<=n-1;i++){
//            int value = arr[i];
//            ans = ans * value;
//        }
//        System.out.println(ans);

//        int arr[] = {3,2,-5,25,1};
//        int n = arr.length;
//        int maxvalue = arr[0];
//
//        for (int i=0;i<=n-1;i++){
//            if (arr[i] > maxvalue){
//                maxvalue = arr[i];
//            }
//        }
//        System.out.println(maxvalue);

//        int arr[] = {3,2,-5,25,1};
//        int n = arr.length;
//        int minvalue = arr[0];
//
//        for (int i=0;i<=n-1;i++){
//            if (arr[i] < minvalue){
//                minvalue = arr[i];
//            }
//        }
//        System.out.println(minvalue);

//        int[][] arr;
//        arr = new int[3][4];
//        int[][] brr = {
//                {1,2},
//                {2,3,4,5},
//                {3,4,6,8,7,9},
//                {4}
//        };
//        System.out.println(brr[3][0]);
//        int rowlength = brr.length;
//        int collength = brr[0].length;
//
//        for (int rowindex = 0; rowindex <=rowlength-1; rowindex++) {
////            jaise hi mai kisi new roe me aaya
////            same point pr mai us row ka collength find out kr lunga
////            current row -> brr[rowIndex]
////          isme kitne columns -> brr[rowIndex].length
//            int collength = brr[rowindex].length;
//
//            for (int colindex = 0; colindex <=collength-1; colindex++){
//                System.out.print(brr[rowindex][colindex] + " ");
//            }
//            System.out.println();
//        }

//        traversal 2D Array
//        for (int rowindex=0;rowindex<=brr.length-1;rowindex++){
//            for (int colindex=0;colindex<=brr[rowindex].length-1;colindex++){
//                System.out.print(brr[rowindex][colindex] + " ");
//            }
//            System.out.println();
//        }

//        int arr[][] = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//        for (int i=0;i<=arr.length-1;i++){
//            for (int j=0;j<=arr[i].length-1;j++){
//                System.out.println("Provide value for row = " + i + " and column = " +j);
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for (int rowindex=0;rowindex<=arr.length-1;rowindex++){
//            for (int colindex=0;colindex<=arr[rowindex].length-1;colindex++){
//                System.out.print(arr[rowindex][colindex] + " ");
//            }
//            System.out.println();
//        }

//        int arr[][] = {{1,2,3}, {1,2,3}};
//        int sum = 0;
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                int value = arr[i][j];
//                sum = sum + value;
//            }
//        }
//        System.out.println(sum);

//        int arr[][] = {{1,2,3}, {1,2,3}};
//        int ans = 1;
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                int value = arr[i][j];
//                ans = ans * value;
//            }
//        }
//        System.out.println(ans);

//        int arr[][] = {{1,2,3}, {20,22,21}};
//        int n = arr.length;
//        int maxvalue = arr[0][0];
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                if (arr[i][j] > maxvalue){
//                    maxvalue = arr[i][j];
//                }
//            }
//        }
//        System.out.println(maxvalue);

        int arr[][] = {{10,26,9}, {20,22,2}};
        int n = arr.length;
        int minvalue = arr[0][0];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j] < minvalue){
                    minvalue = arr[i][j];
                }
            }
        }
        System.out.println(minvalue);

    }
}
