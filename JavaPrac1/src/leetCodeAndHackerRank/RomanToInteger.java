package leetCodeAndHackerRank;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character,Integer> romanMap=new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
        int total=0;
        int length=s.length();
        for(int i=0;i<length;i++){
            if(i<length-1 && romanMap.get(s.charAt(i))<romanMap.get(s.charAt(i+1))){
                total-=romanMap.get(s.charAt(i));
            } else {
                total+=romanMap.get(s.charAt(i));
            }
        }
        return total;
    }


    public static int romanToInt1(String st){
        /*
        * - "IX" → I (1) before X (10) → subtract → 10 - 1 = 9
          - "XL" → X (10) before L (50) → subtract → 50 - 10 = 40
          - "MCMIV" → M (1000) + CM (900) + IV (4) → 190
        * */
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int res = 0;
        for (int i = 0; i < st.length(); i++) {
            int curr = romanMap.get(st.charAt(i));

            if(i+1 < st.length()){
                int next = romanMap.get(st.charAt(i+1));

                if (curr < next){
                    res  -=curr;
                }else {
                    res += curr;
                }
            }else {
                res +=curr;
            }
        }
        return res;

    }

    public static void main(String[] args) {

        String s = "MCMXCIV";
        System.out.println(romanToInt(s));

    }
}
