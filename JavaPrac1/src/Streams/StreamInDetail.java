package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamInDetail {
    public static void main(String[] args) {
        List<Integer> lis = Arrays.asList(3,1,2,5,7,4);

        List<Integer> evenLisDouble = lis.stream().filter(n -> n%2==0).map(n->n*2).collect(Collectors.toList());

        System.out.println("Make the list Even and double : "+evenLisDouble);

        lis.stream().forEachOrdered(n-> System.out.println(n));

        List<String> Slist = Arrays.asList("a", "b", "c", "d","aa","Aa");

        List<String> StartsWithA = Slist.stream().filter(s -> s.startsWith("a") || s.startsWith("A")).collect(Collectors.toList());
        System.out.println("Strings Starts With A : " + StartsWithA);

        List<Integer> freqList = Slist.stream().map(s->s.length()).collect(Collectors.toList());
        System.out.println("The frequency of all elements in list : "+ freqList);

        List<String> limit = Slist.stream().limit(4).collect(Collectors.toList());
        System.out.println("To get list of first 4 elements of parent from limit function : "
                + limit);

        // Example Problems in stream

        List<Double> DoubleList = Arrays.asList(1.0,22.50,31.31,4.0,5.0,6.0,78.0,88.0);

//        Use .get to receive the actual type of the value or else the value will be in optional type
        double avg =  DoubleList.stream().reduce((a, b) -> (a+b)/ DoubleList.size()).get();
        System.out.println("The Average value of the list : "+avg);

//
        List<String>ToUpperCase = Slist.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        List<String> ToLoweCase = Slist.stream().map(s->s.toLowerCase()).collect(Collectors.toList());

        System.out.println("The Upper case : "+  ToUpperCase + " To Lowe case : "+ ToLoweCase);

//
        double max = DoubleList.stream().sorted().collect(Collectors.toList()).get(DoubleList.size()-1);
        double min = DoubleList.stream().sorted().collect(Collectors.toList()).get(0);

        System.out.println("The Min : " + min +" and Max :"+max);
    }
}
