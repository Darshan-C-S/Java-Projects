package ArraysList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFreq {


    public static void countFreqmap(int[]arr , int n ){
        Map<Integer ,Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(mp.containsKey(arr[i])){
                mp.put(arr[i] , mp.get(arr[i])+1);
            }
            else {
                mp.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
            System.out.println(entry.getKey() + " = "+ entry.getValue());
        }
    }

    public static void CountFreqStreamApi(String s){
        System.out.println(s);
        Map<Character,Long> freqMap = s.chars().mapToObj(a -> (char)a).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Count Freq using StreamApi : "+ freqMap);

    }
    public static void main(String[] args) {

        int arr[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 };
        int n = arr.length;

        System.out.println("From Map : ");
        countFreqmap(arr ,n);

        System.out.println("The frequency of string is : ");
        String s= "Darshan";
        CountFreqStreamApi(s);
    }
}
