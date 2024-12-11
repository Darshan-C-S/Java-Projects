package leetCodeAndHackerRank;

import java.util.*;
import java.util.stream.Collectors;

public class ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {

        List<Integer> maxE = new ArrayList<>();
        Arrays.sort(nums);


        for (int i : nums){
            if(!maxE.contains(i)){
                maxE.add(i);
            }
        }

        int max = 0;
        int size = maxE.size();


        if(maxE.size() >=3){
            max = maxE.get(size-3);

        }else {
            max = maxE.get(size-1);
        }

        return max;
    }
    public static void main(String[] args) {

        int []nums  = {3, 2};

        System.out.println(thirdMax(nums));


    }
}
