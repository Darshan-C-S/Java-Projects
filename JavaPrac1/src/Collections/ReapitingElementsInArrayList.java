package Collections;

import java.rmi.MarshalledObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class ReapitingElementsInArrayList {


    public static void main(String[] args) {
        String input = "examplestring"; // Replace with your input string

        // Step 1: Count the frequency of each character
        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("The frequency : "+frequencyMap);
        // Step 2: Separate repeating and non-repeating characters
        List<Character> repeating = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        List<Character> nonRepeating =
                frequencyMap.entrySet().stream().filter(entry -> entry.getValue() ==1)
                        .map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println("Non Repeating : "+ nonRepeating);

        System.out.println("Repeating characters: " + repeating);


        String Imput2 = "Darshan";

        Map<Character , Long> freq = Imput2.chars().mapToObj(x->(char)x).
                collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
        System.out.println(freq);



    }

}
