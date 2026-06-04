package DSAPatterns.PrefixSum;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer k, return the total number of subarray element whose sum equals to k. [1,2,3]

public class subarraySum {
    public static int subarraySum(int[] nums, int k) {

        Map<Integer,Integer>map = new HashMap<>();
        map.put(0,1);

        int sum=0;
        int count = 0;

        for(int n : nums){
            sum += n; // used to count the no of sub array elements

            count += map.getOrDefault(sum-k , 0);
            map.put(sum , map.getOrDefault(sum,0)+1);

        }
        return count;


    }
    public static void main(String[] args) {

        int[] nums = {1,2,3,5};
        int k = 5;
        System.out.println(subarraySum(nums,k));
    }
}
