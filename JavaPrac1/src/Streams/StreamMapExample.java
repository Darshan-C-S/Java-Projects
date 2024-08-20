package Streams;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 5);
        map.put("cherry", 7);
        map.put("date", 2);

        Map<String,Integer> filteredMap = map.entrySet().stream().filter(entry -> entry.getValue()>2 ).
                collect(Collectors.toMap(x->x.getKey(),y->y.getValue()));
        System.out.println("Value filtered above 2 : ");
        for(Map.Entry<String,Integer> m : filteredMap.entrySet()){
            System.out.println("Key : "+m.getKey() + " Value : "+m.getValue());
        }

        Map<String, Integer> filterdResp = map.entrySet().stream().filter(x->x.getKey().startsWith("b")).
                collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue));
        System.out.println("Value filtered key starts with b : ");
        for(Map.Entry<String,Integer>mp : filterdResp.entrySet()){
            System.out.println("Key : "+mp.getKey() + "Value : "+mp.getValue());
        }


        Map<String,Integer> mpfil = map.entrySet().stream().filter(x->x.getValue() >3).
                collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue));
        System.out.println("Value filtered above 3 : ");
        for(Map.Entry<String,Integer> en : mpfil.entrySet()){
           System.out.println("Key : "+en.getKey() + "Value : "+en.getValue());
       }

        Map<String,Integer> mpfilev = map.entrySet().stream().filter(x->x.getValue() %2 ==0)
                .collect(Collectors.toMap(Map.Entry::getKey , Map.Entry::getValue));
        System.out.println("Value filtered is even : ");
       for(Map.Entry<String,Integer> en : mpfilev.entrySet()){
            System.out.println("Key : "+en.getKey() + "Value : "+en.getValue());
        }


    }


}
