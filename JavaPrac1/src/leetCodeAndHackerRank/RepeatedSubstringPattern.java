package leetCodeAndHackerRank;

import Recursion.Factorial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedSubstringPattern {

    public static boolean repeatedSubstringPattern(String s) {

        String doubl = s+s;
        String subs = doubl.substring(1,doubl.length()-1);
        return subs.contains(s);




    }
    public static void main(String[] args) {
        String s  = "AA";
        System.out.println(repeatedSubstringPattern(s));
//        repeatedSubstringPattern(s);


    }
}
