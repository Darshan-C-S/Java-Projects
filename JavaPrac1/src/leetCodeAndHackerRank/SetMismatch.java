package leetCodeAndHackerRank;

import java.util.*;

public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {

        Set<Integer> unique = new HashSet<>();
        int res [] = new int[2];

        for (int i : nums){
            if(unique.contains(i)){
                res[0] = i;
            }
            unique.add(i);
        }
        for (int i = 0; i <= nums.length; i++) {
            if(!unique.contains(i)){
                res[1] = i;
            }
        }
         return res;

    }
    public static void main(String[] args) {

        int[] nums = {1,2,2,4};
        int [] ans = findErrorNums(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
}
