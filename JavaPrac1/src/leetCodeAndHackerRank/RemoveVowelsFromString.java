package leetCodeAndHackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveVowelsFromString {

    public static String removeVowels(String s) {

        char[]chr = s.toCharArray();
        int end  = chr.length -1;
       StringBuffer lis = new StringBuffer();

        String vowels = "aeiouAEIOU";

        for (int i = 0; i < end; i++) {
            if(vowels.indexOf(chr[i]) == -1){
                lis.append(chr[i]);
            }
        }

            return lis.toString();

    }
    public static void main(String[] args) {

        String wo = "IceCreAm";

        System.out.println(removeVowels(wo));

    }
}
