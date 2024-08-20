package Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Arrays;

public class StreamExample2 {
public static void main(String[] args) {
    List<String> list = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

    // Filter: Get fruits that start with 'a'
    List<String> startsWithA = list.stream()
            .filter(fruit -> fruit.startsWith("a"))
            .collect(Collectors.toList());
    System.out.println("Fruits that start with 'a': " + startsWithA);


    /*The double colon (::) operator, also known as method reference
    operator in Java, is used to call a method by referring to it with
    the help of its class directly.
     */
    list.stream().forEach(s -> System.out.println(s));
    list.stream().forEach(System.out::println);
//    Above two strem methods are same



    // Map: Convert all fruits to uppercase
    List<String> upperCaseFruits = list.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
    System.out.println("Fruits in uppercase: " + upperCaseFruits);

    // Sorted: Sort fruits alphabetically
    List<String> sortedFruits = list.stream()
            .sorted()
            .collect(Collectors.toList());
    System.out.println("Sorted fruits: " + sortedFruits);

    // Reduce: Concatenate all fruit names
    String concatenatedFruits = list.stream()
            .reduce("", (a, b) -> a + b);
    System.out.println("Concatenated fruit names: " + concatenatedFruits);

    // Collect: Group fruits by their first letter
    Map<Character, List<String>> groupedByFirstLetter = list.stream()
            .collect(Collectors.groupingBy(fruit -> fruit.charAt(0)));
    System.out.println("Fruits grouped by first letter: " + groupedByFirstLetter);

    Map<Character , List<String>> groupSecondLetter = list.stream().collect(Collectors.groupingBy(a -> a.charAt(1)));
    System.out.println("Fruits grouped by second letter : "+ groupSecondLetter);

}
}