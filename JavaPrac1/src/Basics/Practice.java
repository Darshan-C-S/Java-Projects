package Basics;

import Streams.StreamExample;
import com.sun.source.tree.UsesTree;
import leetCodeAndHackerRank.BinarySearch;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Practice {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int totle = m+n;

        for (int i = m; i <totle ; i++) {
            for (int j = 0 ; j < n ; j++){
                if(nums1[i] == 0){
                    nums1[i++] = nums2[j];
                }
            }
        }
        Arrays.sort(nums1);

    }

    public static void main(String[] args) {







    }
}