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

    public static  int maxOps(int [] arr ,  int k){
        int count = 0;
        int i = 0 ;
        int j = arr.length -1;

        Arrays.sort(arr);
        while (i < j){
            if (arr[i] + arr[j] == k){
                count +=1;
                i+=1;
                j-=1;
            } else if (arr[i] + arr[j] < k) {
                i+=1;
            }else {
                j-=1;
            }

        }
return count;

    }


    public static boolean SumTrue(int [] arr ,  int k){
       Arrays.sort(arr);
       int i = 0;
       int j  = arr.length -1;

       while (i < j){
           if(arr[i] + arr[j] == k){
               return true;
           } else if (arr[i] + arr[j] > k) {
               j-=1;
           }else {
               i++;
           }
       }

       return false;
    }



    public static void main(String[] args) {



        int[] arr = {1,2,3,4,5,10,8,11,9,7,6,15};
        int k  = 10;
        System.out.println(maxOps(arr,k));

       int[] ar = {0, -1, 2, -3, 1};

        System.out.println(SumTrue(ar , -2));



    }
}