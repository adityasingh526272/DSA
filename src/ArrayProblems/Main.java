package ArrayProblems;

public class Main {
    //Question-1
    static double getAverage(int[] arr){
        double sum = 0;
        for (int i : arr){
            sum +=i;
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;
    }

    static void main() {
        int[] arr={5,8,6,3,2};
        System.out.println(getAverage(arr));
    }
}
