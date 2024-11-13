package leetCodeAndHackerRank;

import java.util.*;

public class IntersectionOfArrays {
    public static int[] Intersection(int[] arr1, int[] arr2) {
        Set<Integer>set1 =  new  HashSet<>();

        for (int i = 0; i < arr1.length; i++) set1.add(arr1[i]);

        Set<Integer> res = new HashSet<>();

        for(int i : arr2){
            if(set1.contains(i)){
                res.add(i);
            }
        }

        int[]resar = new int[res.size()];
        int index = 0;
        for(int i : res){
            resar[index++] = i;
        }
        return resar;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] res = Intersection(nums1 , nums2);

        Arrays.stream(res).forEach(x -> System.out.println(x));
    }
}
