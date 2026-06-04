package DSAPatterns.String;

import java.util.HashMap;
import java.util.Map;

public class ransomNote {

    public static boolean isSubset(String ransomNote, String magazine){
        Map<Character, Integer> magazineCount = new HashMap<>();

        for(Character c : magazine.toCharArray()){
            magazineCount.put(c,magazineCount.getOrDefault(c,0)+1);
        }

        for(Character c : ransomNote.toCharArray()){
            if (magazineCount.getOrDefault(c,0) == 0){
                return false;
            }
            magazineCount.put(c ,magazineCount.get(c)-1);
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "aebdcf";
        System.out.println(isSubset(s1, s2));
    }
}
