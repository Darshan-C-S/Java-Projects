package leetCodeAndHackerRank;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2 , 0 , nums1 , m,n);
        Arrays.sort(nums1);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }

    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0}; int  m = 3 ;int n= 2;
        int[]nums2 = {2,5,6};
        merge(nums1, m, nums2, n);
    }
}




