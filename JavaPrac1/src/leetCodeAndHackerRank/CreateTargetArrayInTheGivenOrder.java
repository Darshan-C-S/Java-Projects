package leetCodeAndHackerRank;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArrayInTheGivenOrder {

    public static int[] createTargetArray(int[] nums, int[] index) {

        int []ans  =  new int[nums.length];
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length ; i++) {
            arr.add(index[i] , nums[i]);
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = arr.get(i);
        }
        return ans;

    }

    public static void main(String[] args) {

        int [] arr = {0,1,2,3,4};
        int []index = {0,1,2,2,1};
        int [] ans = createTargetArray(arr, index);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }


    }
}
