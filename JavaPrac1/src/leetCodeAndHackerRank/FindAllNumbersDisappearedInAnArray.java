package leetCodeAndHackerRank;

import java.security.cert.TrustAnchor;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindAllNumbersDisappearedInAnArray {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet <Integer> st = new HashSet<>();
        for(int i : nums){
            st.add(i);
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <nums.length ; i++) {
            if(st.contains(i) == false){
                ans.add(i);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int [] st = {1,1};

        System.out.println(findDisappearedNumbers(st));


    }
}
