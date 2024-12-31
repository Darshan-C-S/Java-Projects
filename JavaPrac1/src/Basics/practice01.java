package Basics;

import LambdasPrac.PrintTh;

import java.util.*;
import java.util.stream.Collectors;

public class practice01 {



    public static void main(String[] args) {

        List<String> names = Arrays.asList("data", "analyze", "add","edit");

        List<String> Anames = names.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());

        System.out.println(Anames);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> even = numbers.stream().filter(a -> a%2 == 0).collect(Collectors.toList());

        System.out.println(even);

        Calculate cal = (int a, int b)-> {return  a+b;};

        System.out.println( cal.calculate(10 , 11));

        PrintHer Intro = (n) -> {
            System.out.println("My name is : "+n);
        };

        Intro.print("Darshan");




    }
}
