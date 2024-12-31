package Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorExample {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");

       names.sort((a,b)-> a.compareTo(b));

        System.out.println(names);


    }
}
