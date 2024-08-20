package leetCodeAndHackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CheckAnigram {

    //    Using List
    public static boolean CheckAnig(String s ,  String l){
       ArrayList<Character> a = new ArrayList<>();
        ArrayList<Character> b = new ArrayList<>();
        for (char an : s.toCharArray()){ a.add(an);}
        for (char bn : l.toCharArray()){ b.add(bn);}

        return (a.stream().sorted().collect(Collectors.toList()).equals(b.stream().sorted().collect(Collectors.toList())));
    }

    //    Using Arrays
    public static boolean CheckAnig1(String s ,  String l){

        char[] s1 = s.toCharArray();
        char[] t1= l.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1,t1);

    }

    public static void main(String[] args) {

        System.out.println(CheckAnig("ABC","CAB"));
        System.out.println(CheckAnig("ABC","ADC"));
        System.out.println(CheckAnig("race","care"));

        System.out.println("Second Anagram method ");

        System.out.println(CheckAnig1("ABC","CAB"));
        System.out.println(CheckAnig1("ABC","ADC"));
        System.out.println(CheckAnig1("race","care"));

    }
}
