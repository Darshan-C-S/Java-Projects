package leetCodeAndHackerRank;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {
    public static int compress2(char[] chars) {

        Map<Character , Integer> map = new HashMap<>();


        for (int i = 0; i < chars.length; i++) {
            if(map.containsKey(chars[i])){
                map.put(chars[i] , map.get(chars[i])+1);
            }else {
                map.put(chars[i] , 1);
            }
        }

        int idx=0;

        for(Map.Entry<Character , Integer> en : map.entrySet()){

            if (en.getValue().equals(1)){
                chars[idx++] = en.getKey();
            }else {
                chars[idx ++] = en.getKey();
                for(char dig : Integer.toString(en.getValue()).toCharArray()){
                    chars[idx++] = dig;
                }
            }


        }

            return idx;
    }

    public static int compress(char[] chars) {

        int n = chars.length;
        int idx = 0;

        for(int i= 0 ; i<n ;i++){
            char ch = chars[i];
            int count = 0;
            while (i<n && chars[i] == ch){
               count++;
               i++;
            }

            if(count == 1){
                chars[idx++] = ch;
            }else {
                chars[idx++] = ch;
                for(char digit : Integer.toString(count).toCharArray()){
                    chars[idx++] = digit;
                }
            }
            i--;

        }
            return idx;

    }
    public static void main(String[] args) {

     char[] ar = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(ar));
        System.out.println(compress2(ar));






    }
}
