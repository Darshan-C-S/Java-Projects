package ArraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamproblems {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        List<Integer> lenthList  = cars.stream().map(String::length).collect(Collectors.toList());
        lenthList.stream().forEach(System.out::println);
    }
}
