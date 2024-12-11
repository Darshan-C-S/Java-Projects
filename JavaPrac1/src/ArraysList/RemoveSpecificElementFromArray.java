package ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveSpecificElementFromArray {
//    public static void removeSpecificElement(int []arr , int target){
///*  To remove element first we have to search the index of the element  */
//
//        Arrays.sort(arr);
//
//        int low = 0;
//        int high = arr.length-1;
//
//
//        while(low <=high){
//            int mid = (low+high)/2;
//
//            if(arr[mid] == target){
//                arr[mid]=0;
//            } else if (arr[mid]<target) {
//                low = mid+1;
//            }else {
//                high = mid-1;
//            }
//        }
//        List<Integer> res = new ArrayList<>();
//        for(int i : arr){
//            if(i != 0){
//                res.add(i);
//            }
//        }
//        System.out.println("The list after removing the element is : "+res);
//
//
//
//    }

    public static void removeSpecific2(int []arr , int tar){

        List<Integer>removeTar = new ArrayList<>();
        List<Integer>res = new ArrayList<>();

        for(int i:arr){
            if(i==tar ) {
                removeTar.add(i);
            }else {
                res.add(i);
            }

        }
        System.out.println("Array after removing target : "+res);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {1,2,3,4,6,0,7};
        System.out.println("The Given array is : "+ Arrays.toString(arr));
        System.out.println("Enter the target to be removed : ");
        int target = in.nextInt();
//        removeSpecificElement(arr , target);
        removeSpecific2(arr,target);
    }
}
