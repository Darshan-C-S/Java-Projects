package leetCodeAndHackerRank;

import java.util.*;
import java.util.stream.Collectors;

public class MissingNumber {

    public static void missingNumber(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        Arrays.sort(nums);

        List<Integer> com    = new ArrayList<>();
        for (int i = 0; i < nums.length+1; i++) {
            com.add(i);
        }
        for (int i : nums){
            com.add(i);
        }
        System.out.println(com);

        for (int i = 0; i < com.size(); i++) {
            if(map.containsKey(com.get(i))){
                map.put(com.get(i) , map.get(com.get(i))+1);
            }else {
            map.put(com.get(i),1);
        }}

        int ans = 0;
        for (Map.Entry<Integer,Integer>ma : map.entrySet()){
            if(Objects.equals(1,ma.getValue())){
                ans = ma.getKey();
            }
        }
        System.out.println(ans);;



    }

    public static void main(String[] args) {

        int[]num = {3,0,1};
        missingNumber(num);

    }
}
