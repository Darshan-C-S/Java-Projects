package Dictionaryops;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapEntrySetPartitionBy {
    public static void main(String[] args) {

        /* Second example to explain entry set and partition by */

        Map<String,String> map2 = new HashMap<>();

        map2.put("Hello","Hello");
        map2.put("World","World");
        map2.put("Billy","Billy");
        map2.put("Name","Name");
        map2.put("it","it");
        map2.put("Just Do it","Just Do it");

//        In entry set the key and value will be  in form of set
        System.out.println("The entry set value is : "+map2.entrySet());

//        Loop through Entry set to get key and value
        for(Map.Entry<String,String>mp : map2.entrySet()){
            System.out.println("Key : " + mp.getKey() + " , Value : "+ mp.getValue());
        }

        /*      Perform Partition by operation to filter out the key whose lent is >= 6    */
        Map<Boolean , List<Map.Entry<String,String>>> pmp  = map2.entrySet().stream().collect(Collectors.partitioningBy(x->x.getKey().length() >= 6));

        System.out.println("Required Length : ");
        List requiredLength = pmp.get(true);

//    The datatype of requiredLength from the true value to the partition by is object
        for(Object i  : requiredLength ){
            System.out.println(i);
        }
        System.out.println("Not Required Length : ");
        List NotRequiredLent = pmp.get(false);
        for(Object i :NotRequiredLent){
            System.out.println(i);
        }

    }
}
