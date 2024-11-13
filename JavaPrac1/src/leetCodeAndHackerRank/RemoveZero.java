package leetCodeAndHackerRank;

import java.util.Arrays;

public class RemoveZero {
    public static void moveZeroes(int[] nums) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;

        }

        }
        Arrays.stream(nums).forEach(System.out::println);
    }
    public static void main(String[] args) {

        int [] nums = {0,1,0,3,12};
        moveZeroes(nums);


    }
}