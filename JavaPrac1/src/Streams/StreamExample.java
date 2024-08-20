package Streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        /*Stream Intermediate operations */

        List<Integer> arr1 = Arrays.asList(1,2,3,4,5,6,7,8);
        List<String>arr2 = Arrays.asList("ARR","Brr","Crr","DRR");
//        Maps
        List<Integer> MapArrDouble1  =arr1.stream().map(x->x*2).collect(Collectors.toList());
        System.out.println("Map example to make arraylist double : "+ MapArrDouble1);
//        Filter
        List<Integer> FilterArrEven1 = arr1.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println("Filter example to get even list : "+ FilterArrEven1);
//      Sorted
        List<Integer>  ReverseSortedArray = arr1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sort example to get reverse sorted List : "+ ReverseSortedArray);

        /*Stream Terminal operations */

//     Collect is used to collect the info from the intermediate operetions collect(Collectors.toList())
        List<Integer> collectExa = arr1.stream().collect(Collectors.toList());
//       For Each
        arr1.stream().filter(x-> x%2 != 0).forEach(x-> System.out.println("The odd List example to use for each : "+x));
//      Reduce
        int sumOfDivsibelBy3 = arr1.stream().filter(x->x%3==0).reduce(0,(a,b)->a+b);
        System.out.println("Reduse Example for Sum of Divisible by 3 : "+sumOfDivsibelBy3);



        List<String> fruits = Arrays.asList("apple", "banana", "orange", "apricot", "blueberry");

        // Filter fruits starting with 'a' and collect them into a list
        List<String> filteredFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println("Fruits starting with 'a': " + filteredFruits);

        List<String>filteredFruitsB = fruits.stream().filter(s->s.startsWith("b")).collect(Collectors.toList());
        System.out.println("Fruits starting with 'b': " + filteredFruitsB);


        List<String> filterdFruits1 = fruits.stream().filter(fruit ->fruit.endsWith("e")).collect(Collectors.toList());

        List<String> filterFruitsB = fruits.stream().filter(fruit -> fruit.startsWith("b")).collect(Collectors.toList());

        System.out.println("Fruits which ends with 'e': "+ filterdFruits1+ " and starts with b : "+filterFruitsB);

        // Map fruits to their lengths and print the lengths
        fruits.stream()
                .map(String::length)
                .forEach(length -> System.out.println("Length: " + length));


        // Check if any fruit has length > 7
        boolean anyMatchResult = fruits.stream().anyMatch(fruit -> fruit.length() > 7);
        System.out.println("Any fruit with length > 7? " + anyMatchResult);

        //sorted list
        List<String> sortedList = (List<String>) fruits.stream().sorted().collect(Collectors.toList());
        System.out.println("the sorted list :"+ sortedList);

        List<Integer> noList = Arrays.asList(1,2,3,4,5,7,8,6,11,9,10,12);
        List<Integer> sortedNoList = (List<Integer>) noList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted Integer List is : "+sortedNoList);
        System.out.println("Multiplication ops with map : "+noList.stream().map(x -> x*2).sorted().collect(Collectors.toList()));










    }
}
