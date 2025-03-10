package leetCodeAndHackerRank;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
//        Define a map to store the index in key and Array value in value
        Map<Integer, Integer> map = new HashMap<>();

        /* Traverse through the input list and calculate the compliment which is the difference of
        * the values in list to the target
        *
        * If the compliment matches to the value present in the map with key and value
        * Return the value of the component key which has the index  and the index of the difference
        * Else give illegal args exception */

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSum2(int[]arr , int tar){

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff= tar - arr[i];

            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i };
            }
            map.put(arr[i] , i);
        }
        throw new IllegalArgumentException("No two sum 2");

    }



    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        TwoSum1 solution = new TwoSum1();
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);

        int[] res2 = twoSum2(nums , target);
        System.out.println("The solution for twosum2 and there indices are: "+ res2[0] +" and "+ res2[1]);

    }
}