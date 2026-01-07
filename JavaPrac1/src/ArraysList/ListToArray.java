package ArraysList;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        // Example list of integers
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

       int [] array = list.stream().mapToInt(Integer::intValue).toArray();

        // Print the resulting array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
