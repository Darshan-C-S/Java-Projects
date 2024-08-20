package Dictionaryops;

import java.util.HashMap;
import java.util.Map;

public class Mapsops {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();

        map.put("Darshan" , 1);
        map.put("Jon",2);
        map.put("Sima",3);
        map.put("Shilu",4);


        for (String k : map.keySet()){
            System.out.println(map.get(k));
        }
        System.out.println("Extract values without key set :");
        for(int no:map.values()){
            System.out.println(no);
        }

    }
}
