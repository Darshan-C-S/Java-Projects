package DSAPatterns.ListAndArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int total = m+n;

        for (int i = m; i < total; i++) {
            for (int j = 0; j < n; j++) {
                if (nums1[i]==0){
                nums1[i++] = nums2[j];
            }
            }
    }
        Arrays.sort(nums1);


    }
    public static void main(String[] args) {

    }
}
