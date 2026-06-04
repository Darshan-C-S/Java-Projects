package DSAPatterns.String;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        /*
        * An anagram is a word or phrase formed
        *  by rearranging the letters of a different word or phrase, using all the original
        *  letters exactly once.
        * */

        int [] count = new int[26];

        if(s.length() != t.length()){
            return false;
        }

        // Count characters in s

        for(char c :s.toCharArray()){
            count[c-'a']++;
        }
        // Subtract characters in t

        for (char c : t.toCharArray()){
            count[c-'a']--;
        }

        // If any count is non-zero, not an anagram

        for (int i:count) {
            if(i !=0){
                return false;
            }
        }
        return true ;

    }

    public static void main(String[] args) {

    }
}
