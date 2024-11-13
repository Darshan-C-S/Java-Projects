package Dictionaryops;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxSalary {
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

        int max = map.values().stream().sorted().collect(Collectors.toList()).get(map.values().size()-1);
        for(Map.Entry<String,Integer> m : map.entrySet()){
            if(m.getValue() == max){
                System.out.println(m.getKey()+ " has the max sal of : "+m.getValue());
            }
        }


    }
}
