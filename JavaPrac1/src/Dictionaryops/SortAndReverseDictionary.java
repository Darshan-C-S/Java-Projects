package Dictionaryops;

import java.util.*;

public class SortAndReverseDictionary {
    public static void main(String[] args) {


        Map<Integer, Integer> map = new HashMap<>();

        // Adding some key-value pairs to the map

        map.put(2, 200);
        map.put(4, 400);
        map.put(3, 300);
        map.put(1, 100);

        map.entrySet().stream().sorted();

        System.out.println("Map after Sorted : "+ map);

//        To reverse a map

        LinkedHashMap<Integer, Integer> revMap = new LinkedHashMap<>();

        List<Map.Entry<Integer,Integer>>en = new ArrayList<>(map.entrySet());
        Collections.reverse(en);

        for (Map.Entry<Integer,Integer> e : en){
            revMap.put(e.getKey(),e.getValue());
        }

        System.out.println("Reversing The sorted Map : " + revMap);

    }
}
