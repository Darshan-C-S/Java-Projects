package ArraysList;

import java.util.HashMap;
import java.util.Map;

public class countDuplicateElements {
    public static void count (int [] arr) {
        Map<Integer,Integer>mp = new HashMap<>();
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else {
                mp.put(arr[i],1 );
            }
        }
        System.out.println("The Frequency of the given list is : "+ mp);
        for (int i : mp.values()){
//  The values of the maps are fetched in form of list and its iterable in for loop like above
            if(i >1){
                count ++;
            }
        }
        System.out.println("The No of elements having duplicate value is : " + count);


    }

    public static void main(String[] args) {
        int [] a = {1,2,3,2,3,4,4,5,6,6,7,7,2};
        count(a);

    }
}
