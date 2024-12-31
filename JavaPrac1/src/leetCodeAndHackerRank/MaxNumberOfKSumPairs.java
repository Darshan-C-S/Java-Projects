package leetCodeAndHackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxNumberOfKSumPairs {

    public int maxOperations(int[] nums, int k) {

        int count = 0;
        int i = 0;
        int j  = nums.length-1;

        Arrays.sort(nums);

        while (i < j){
            if(nums[i]+ nums[j] == k){
                count++;
                i++;j--;

            }else if (nums[i]+ nums[j] > k){
                j--;
            }else {
                i++;
            }
        }

        return count;


    }
    public static void main(String[] args) {

    }
}
