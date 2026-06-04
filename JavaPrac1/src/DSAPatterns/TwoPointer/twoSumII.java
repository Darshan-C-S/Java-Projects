package DSAPatterns.TwoPointer;

import java.util.Arrays;

public class twoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while (left<right){
            int sum = numbers[left]+numbers[right];
            if (sum == target){
                return new int[]{left,right};
            }else if (sum<target){
                left ++;
            }else {
                right --;
            }
        }
        return new int[]{};

    }
    public static void main(String[] args) {

        int[]ar = {1,2,3,4,5};
        Arrays.stream(twoSum(ar, 4)).forEach(System.out::println);

    }
}
