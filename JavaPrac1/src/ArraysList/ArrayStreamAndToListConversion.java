package ArraysList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayStreamAndToListConversion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,7,8};


        List<Integer> li  = Arrays.stream(arr).boxed().toList();


        int maxArr = Arrays.stream(arr).max().getAsInt();

        int [] sortedArr = Arrays.stream(arr).sorted().toArray();



        System.out.println(maxArr);
        System.out.println(sortedArr);







    }
}
