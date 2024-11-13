package Dictionaryops;

import java.util.HashMap;

public class MapsHash {
    public static void main(String[] args) {
        /* HashMaps provide constant time access to elements,
           which means that retrieval and insertion of elements
           are very fast, usually O(1) time complexity.

           HashMaps allows any of its values to be null , as well as one of its keys

           HashMaps allow for duplicate values, but not duplicate keys.

           HashMaps are not thread-safe, which means that if multiple threads
           access the same hashmap simultaneously, it can lead to data inconsistencies.
           If thread safety is required, ConcurrentHashMap can be used.

        */


        HashMap<Integer , String> studentDetails = new HashMap<>();

        studentDetails.put(1,"Darshan");
        studentDetails.put(2,"Katyaeni");
        studentDetails.put(3,"Ragav");
        studentDetails.put(4,"Dev");

        System.out.println(studentDetails);
        System.out.println(studentDetails.size());

        studentDetails.put(4,"Deva");
        studentDetails.put(5,"yellow");//update
        System.out.println(studentDetails);

        studentDetails.remove(5);//remove and replace
        studentDetails.replace(4,"Deva","Dev");
        System.out.println(studentDetails);

        //traverse through hash map
        studentDetails.forEach((key,value) -> System.out.println("Key : " +key+ " value : "+value));
        studentDetails.forEach((k,v)-> {if(k > 2) System.out.println("The values above 2 are : "+ v);});


    }
}
