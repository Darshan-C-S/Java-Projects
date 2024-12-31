package Basics;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class prac11 {
    public static void main(String[] args) {
        String st  = "Good day day bye bye";

        Set<String> res =new HashSet<>();


        for(String s: st.split(" ")){
            res.add(s);
        }

        String rest = "";

        for(String s : res){
            rest +=  s+ " ";
        }
        System.out.println(rest);


    }
}
