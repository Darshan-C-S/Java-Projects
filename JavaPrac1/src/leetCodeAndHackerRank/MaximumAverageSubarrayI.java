package leetCodeAndHackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumAverageSubarrayI {

    public static double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // Step 2: Use sliding window to find the maximum average.
        double maxAvg = sum / k;  // Initial average

        for (int i = k; i < nums.length; i++) {
            // Slide the window: remove the element going out of the window and add the new element
            sum += nums[i] - nums[i - k];
            maxAvg = Math.max(maxAvg, sum / k);  // Update the max average
        }

        return maxAvg;

    }

    public static void main(String[] args) {

            int [] arr = {1,0,1,4,2};
        System.out.println(findMaxAverage(arr,4));;



    }

}
