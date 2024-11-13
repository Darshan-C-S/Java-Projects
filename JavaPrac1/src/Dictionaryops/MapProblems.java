package Dictionaryops;

import java.util.HashMap;
import java.util.Map;

public class MapProblems {
    public  static int  findCountOfDuplicates(int[]arr){
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i])+1);
            }else {
                map.put(arr[i] , 1);
            }
        }
        int count = 0;
        for (int i : map.values()) {
            if (i>1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int[] arr = {2 ,3 ,2 ,2 ,3 , 4,4};

        System.out.println(findCountOfDuplicates(arr));

    }
}
