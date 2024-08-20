package leetCodeAndHackerRank;

import java.util.Arrays;

public class MaxProductDiffrence {
    public static int maxprodDiff(int[]arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int prod = (arr[arr.length-1]*arr[arr.length-2]) -(arr[0]*arr[1]);
            return prod;
        }
        return -1;
    }

    public static void main(String[] args) {

        int []arr  = {5,6,2,7,4};
        System.out.println(maxprodDiff(arr));
    }
}
