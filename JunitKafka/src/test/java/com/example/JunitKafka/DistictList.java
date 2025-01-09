package com.example.JunitKafka;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistictList {

    static String rev(String name){

        StringBuffer NameSt = new StringBuffer(name);
        StringBuffer NameSt2 = NameSt.reverse();
        String RevString = NameSt2.toString();
        return RevString;

    }


    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,5,6,6);

        List<Integer> DistinctnNumber = number.stream().distinct().collect(Collectors.toList());
        System.out.println(DistinctnNumber);

        String Name = "Darshan";
        System.out.println(rev(Name));
    }

}
