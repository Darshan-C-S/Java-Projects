package ArraysList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,4,5,5,6};

        List<Integer>dup= new ArrayList<>();
        Map<Integer,Integer>mp = new HashMap<>();

        for(int i =0 ;i<a.length;i++){
            if(mp.containsKey(a[i])){
                mp.put(a[i],mp.get(a[i])+1);
            }else {
                mp.put(a[i],1);
            }

            if(mp.get(a[i]) >1){
                dup.add(a[i]);
            }

        }
        System.out.println(dup);

    }
}
