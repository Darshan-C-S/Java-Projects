package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPrctice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> even = numbers.stream().filter(x->x%2==0).collect(Collectors.toUnmodifiableList());
        System.out.println("Even list : "+even);

        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
        int n = names.stream().filter(a->a.startsWith("A")).collect(Collectors.toList()).size();
        System.out.println("The no of words with prefix A: " + n);

        List<Integer> nu1 = Arrays.asList(1, 2, 3, 4, 5, 6,6,5,1,3);
       Map<Integer,Long> map1 = nu1.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
        System.out.println("The freq of the elements are : "+ map1);

        String input = "swiss";
        Optional<Character> firstNonRepeated = input.chars().mapToObj(c->(char)c)
                .filter(i->input.lastIndexOf(i) == input.indexOf(i))
                .findFirst();
        System.out.println("First non repeated element :  "+firstNonRepeated.orElse(null)); // Output: w

        List<Integer> nu2 = Arrays.asList(1, 2, 3, 4, 5);
        int i = nu2.stream().reduce(0,Integer::sum);
        System.out.println("The umed up value : "+ i);

    }
}
