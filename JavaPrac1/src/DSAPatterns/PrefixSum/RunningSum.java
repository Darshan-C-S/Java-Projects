package DSAPatterns.PrefixSum;

import java.util.Arrays;

public class RunningSum {
    public static int[] runningSum(int[] nums) {

        int[]prefex = new int[nums.length];
        prefex[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefex[i] = prefex[i-1]+nums[i];
        }
        return prefex;

    }


    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 7, 3};
        Arrays.stream(runningSum(arr)).forEach(System.out::println);
    }
}
