package Streams;

import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class CollectorsImpl {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,6);

        List<Integer> squareNo = integers.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println("To List implementation : "+ squareNo);

        List<Integer> evenList  = integers.stream().filter(x->x%2 == 0).distinct().collect(Collectors.toList());
        System.out.println("To List Event : "+ integers);



    }
}
