package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateElementsInString {

    public static void PrintDupe(String str){

        Map<Character , Integer> map = new HashMap<>();

        char[]ch = str.toLowerCase().replaceAll("\\s","").toCharArray();

        for (int i = 0; i < ch.length; i++) {

            if(map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i])+1);
            }else {
                map.put(ch[i],1);
            }
            if(map.get(ch[i]) > 1){
                System.out.println(ch[i]);
            }
        }
//        System.out.println("Frequency map : "+map);

    }

    public static void main(String[] args) {
        String name = "Darshan C S";
        PrintDupe(name);
    }
}
