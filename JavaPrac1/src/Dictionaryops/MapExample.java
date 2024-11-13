package Dictionaryops;

import java.util.*;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Cherry", 7);

        // Access a value
        System.out.println("Value for key 'Banana': " + map.get("Banana")); // Output: 5
        System.out.println("Key Of 5 : ");

        // Check if a key or value exists
        System.out.println("Contains key 'Apple': " + map.containsKey("Apple")); // Output: true
        System.out.println("Contains value 5: " + map.containsValue(5)); // Output: true

        // Remove a key-value pair
        map.remove("Cherry");
        System.out.println("Map after removal: " + map); // Output: {Apple=3, Banana=5}

        // Iterating over keys
        for (String key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        // Iterating over values
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }




//        Put all method to copy the contents from one map to another
        Map<String,Integer> veg = new HashMap<>();
        veg.put("Tomato",1);
        veg.put("brinjal",8);

        map.putAll(veg);
        System.out.println("The new map after Put all : "+map);


        // Using default methods
        map.putIfAbsent("Orange", 10);
        map.putIfAbsent("Pomegranate", 8);
        System.out.println("Map after putIfAbsent: " + map); // Output: {Apple=3, Banana=5, Date=8}

        map.replace("Banana", 6);
        System.out.println("Map after replace: " + map); // Output: {Apple=3, Banana=6, Date=8}


        for(Map.Entry<String, Integer> en : map.entrySet()){
            System.out.println("Key : "+en.getKey() + ", Value : "+en.getValue());
        }

        HashMap<String , Integer> greaterThan3 = new HashMap<>();
        for (Map.Entry<String , Integer> en: map.entrySet()){
            if(en.getValue()>3){
                greaterThan3.put(en.getKey(), en.getValue());
            }
        }
        System.out.println("Greater Than 3 by filtering through entry set : "+ greaterThan3);
        /* Partition By Example for map where the its map with key as
        bool and value as the list of map entry of the map
         * Here the partition by is useful to partition two set of
         data one which is true to the filter function in the
         * stream an another which is false
         * */

        /* First example to explain entry set and partition by */

        Map<Boolean,List<Map.Entry<String,Integer>>> MapNo = map.entrySet().stream().
                collect(Collectors.partitioningBy(x ->x.getValue()%2 ==0));
        System.out.println("Map After Partition is : "+MapNo);
        System.out.println("<<<<<<<< Getting even value using Partition By >>>>>>>>");
        List EvenMapNo = MapNo.get(true);
        for(Object i :EvenMapNo){
            System.out.println(i);
        }
        System.out.println("<<<<<<<< Getting Odd value using Partition By >>>>>>>>");
        List OddMapNo = MapNo.get(false);
        for(Object i :OddMapNo){
            System.out.println(i);
        }








    }
}
