package leetCodeAndHackerRank;

import java.util.*;
import java.util.stream.Collectors;

public class UniqueNumberOfOccurrences {

    public static boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i , map.getOrDefault(i ,0)+1);
        }


     Set<Integer> se = new HashSet<>();

        for(int i  : map.values()){
            if(!se.add(i)){
                return false;
            }
        }
        return true;


    }



    public static void main(String[] args) {

        int [] nums = {1,2,2,1,1,3,3};

        System.out.println(uniqueOccurrences(nums));




    }
}
