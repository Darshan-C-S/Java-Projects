package ArraysList;

import java.util.Arrays;

public class InsertNewElement {

    public static void insertEleArray(int [] arr , int ele , int pos){

        int pos2 = pos -1;
        if (pos2 < arr.length){
            for (int  i = arr.length -1; i > pos2 ; i--){
                arr[i] = arr[i-1];
            }
        }
        arr[pos2] = ele;

        System.out.println("The array after inserting the element is : "+Arrays.toString(arr));

    }

    public static void main(String[] args) {
//        Note Here the last element of the array will be removed as the size of the array remains same

        int [] arr = {1,2,3,4,5,6,7,8};
        int ele = 10;
        int pos = 6;
        insertEleArray(arr,ele,pos);
    }
}
