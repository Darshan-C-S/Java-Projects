package leetCodeAndHackerRank;

import java.util.*;

public class FindTheDifferenceOfTwoArrays {

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int i : nums1){
            s1.add(i);
        }
        for(int i : nums2){
            s2.add(i);
        }

        for(int n : nums2){
            if(s1.contains(n)){
                s1.remove(n);
                s2.remove(n);
            }
        }
        ans.add(new ArrayList<>(s1));
        ans.add(new ArrayList<>(s2));

        return ans;
    }
    public static void main(String[] args) {

        int [] nums1 = {1,2,3}, nums2 = {2,4,6};

        System.out.println(findDifference(nums1,nums2));


    }
}
