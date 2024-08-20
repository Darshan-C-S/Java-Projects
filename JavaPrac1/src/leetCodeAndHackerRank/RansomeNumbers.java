package leetCodeAndHackerRank;

import java.util.Collections;
import java.util.List;

public class RansomeNumbers {

    /*Given two strings ransomNote and magazine, return true if ransomNote can be
    constructed by using the letters from magazine and false otherwise.
    Note : Each letter in magazine can only be used once in ransomNote.*/
    public static void canConstruct(String ransomNote, String magazine) {
//        char[] mag = magazine.toCharArray();
//        char[] ran =
        List<char[]> ran = Collections.singletonList(ransomNote.toCharArray());
        List<char[]> mag = Collections.singletonList(magazine.toCharArray());


        for (char[] n : mag){
            if(mag.contains(n)){
                System.out.println(true);

            }
        }



    }
    public static void main(String[] args) {

        canConstruct("Dra","Dar");



    }
}
