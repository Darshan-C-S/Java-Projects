package Basics;

import java.util.*;
import java.util.stream.Collectors;

public class practice01 {

    public static void maxSal( Map<String , Integer> map ){

        List<Integer> val   = map.values().stream().toList();

        int maxSal = val.stream().sorted().collect(Collectors.toList()).get(val.size()-1);

        for (Map.Entry<String , Integer> ma  : map.entrySet() ) {
                if(ma.equals(maxSal)){
                    System.out.println();
                }
        }
    }
    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();


        map.put("Darshan", 200000);
        map.put("Jhon" , 100000);
        map.put("Megha", 300000);
        map.put("Bill" , 50000);
        map.put("Warres", 40000);
        map.put("AAA" , 355000000);

        List<Integer> val = map.values().stream().toList();
        int Hi = val.stream().sorted().collect(Collectors.toList()).get(val.size()-1);

        for(Map.Entry<String,Integer> m: map.entrySet()){
            if(m.getValue() == Hi){
                System.out.println(m.getKey());
            }
        }
//        Or

        map.forEach((k,v) ->{if(v == Hi){
            System.out.println(k);
        }});

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("Key : "+ entry.getKey()+" , Value : "+entry.getValue());
        }
        System.out.println("Map Size : "+map.size());

        HashMap<String,Integer>copyMap = new HashMap<>(map);
//        copyMap.clear();

        System.out.println("Copy map Values : "+copyMap.values());



    }
}
