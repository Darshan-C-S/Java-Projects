package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsBasics {
    public static void main(String[] args) {

//        Creation of stream
        List<Integer> li  = Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> st = li.stream();

//      Filter operation
        List<Integer> evenLst = li.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println("Even list after filter operation : "+ evenLst);

//      Mapping operation
        List<String> stli = Arrays.asList("a","b","cc","dd");
        List<Integer> lenList = stli.stream().map(String::length).collect(Collectors.toList());
        System.out.println("Lent of each element in the string list : "+lenList);

//      Reducing the element
        Optional<String> concat = stli.stream().reduce((x,y)->x+y);

//      Using for each to prin the elements
        concat.stream().forEach(System.out::println);

//      Distinct element
        List<Integer> intlis = Arrays.asList(1,2,3,4,4,5,6);
        List<Integer> disLis = intlis.stream().distinct().collect(Collectors.toList());

        System.out.println("The list having distinct elements : "+disLis);

//      Limit is used to give the first n no of elements in the list
        List<Integer> limitList = intlis.stream().limit(4).collect(Collectors.toList());
        System.out.println("The limit list : "+limitList);

//      Skip methods skips the first n no of elements in the list
        List<Integer> skipList = intlis.stream().skip(2).collect(Collectors.toList());
        System.out.println("The skip List : "+skipList);

//        Matching the element with a

        boolean AllTrue = stli.stream().allMatch(a->a.startsWith("a"));
        System.out.println("Is there all elements start with a : " +AllTrue);

        boolean SomeTrue = stli.stream().anyMatch(a->a.startsWith("a"));
        System.out.println("Is there any one element start with a : "+SomeTrue);

        boolean NoneTrue = stli.stream().noneMatch(a->a.startsWith("a"));
        System.out.println("none of the element start with a : "+ NoneTrue);








    }
}
