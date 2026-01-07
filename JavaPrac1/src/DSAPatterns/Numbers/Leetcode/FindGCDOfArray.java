package DSAPatterns.Numbers.Leetcode;

import java.util.Arrays;

public class FindGCDOfArray {
    public static int findGCD(int[] nums) {
        Arrays.sort(nums);

        int a = nums[0];
        int b = nums[nums.length-1];

        return eculiedsAlgo(a,b);
    }

    public static int eculiedsAlgo ( int a , int b){

        if(a == 0){
            return b;
        }else {
            return eculiedsAlgo(b%a , a);
        }
    }
    public static void main(String[] args) {

        int [] nums = {2,5,6,9,10};
        System.out.println(findGCD(nums));
    }
}
