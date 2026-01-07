package Basics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class prac11 {
    public static void main(String[] args) {
        String st  = "Hello Darshan How are you you";

//        Hello Darshan How are you

        Set<String> set  = new LinkedHashSet<>();

//        Use Linked Hash set to maintain the insertion order and Hash set maintain insertion order after version 21
        for(String s : st.split(" ")){
            set.add(s);
        }

        String res = "";
        for(String s : set){
            res += s + " ";
        }
        System.out.print(res);

//        System.out.println(set);

    }
}
