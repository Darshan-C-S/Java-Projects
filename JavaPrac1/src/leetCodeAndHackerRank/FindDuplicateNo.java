package leetCodeAndHackerRank;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateNo {
    public static int findDuplicate(int[] nums) {

        Map<Integer,Integer>map = new HashMap<>();
        int dupe = 0;

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            if(entry.getValue() > 2){
                dupe = entry.getKey();
            }
        }
        return dupe;
    }
    public static void main(String[] args) {

        int[]nums = {3,3,3,3,3};
        System.out.println(findDuplicate(nums));

    }
}
