package DSA;

import java.util.Arrays;

public class ImpSearchingAndSortingAlgo {
    public static int[] BubbleSort(int[] nums) {

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums [j] = nums[j+1];
                    nums[j+1] = temp;
                }

            }
        }
        return nums;
    }

    public static int[] quickSort(int [] nums , int low , int high){


        if(low<high){
            int pevoteIndex = partitionBy (nums , low , high);
            quickSort(nums, low , pevoteIndex-1);
            quickSort(nums , pevoteIndex+1 , high);

        }
        return nums;


    }

    private static int partitionBy(int[] nums, int low, int high) {

        int pevote = (high+low)/2;
        int i = low;
        int j  = high;

        while (i<=j){

            while (nums[i] < pevote){
                i++;
            }
            while (nums[j]> pevote){
                j--;
            }
            if(i<=j){
                swap(nums , i ,j);
                i++;
                j--;
            }

        }
        return i;


    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    public static int BinarySearch(int[] nums , int tar){
        int lo  = 0;
        int hig = nums.length-1;

        while (lo<=hig){
            int mid = (lo+hig)/2;
            if(nums[mid] == tar){
                return mid;
            } else if (nums[mid] < tar) {
                lo = mid+1;
            }
            else {
                hig  = mid-1;
            }
        }
        return -1;
    }

    public static int BinaryRecursivSearch(int[] nums , int target , int low , int high) {

        int mid = low +(high - low)/2;//123456789

        if(low <= high){
            if( nums[mid] == target){
                return mid;
            }
        } else if (nums[mid]> target) {
            return BinaryRecursivSearch(nums, mid + 1, high, target);
        } else {
            return BinaryRecursivSearch(nums, low, mid - 1, target);
        }

        return -1;


    }


    public static void main(String[] args) {

        int[] nums = {2,8,7,11,6,15};
        Arrays.stream(BubbleSort(nums)).forEach(System.out::println);
        int j = nums.length-1;
        System.out.println("Quick Sort : ");
        Arrays.stream(quickSort(nums,0,j)).forEach(System.out::println);

        System.out.println("Binary search result : "+BinarySearch(nums,8));

        System.out.println("Binary recursive Search : "+ BinaryRecursivSearch(nums , 8 , 0 , nums.length));


    }
}

