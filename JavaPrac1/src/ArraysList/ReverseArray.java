package ArraysList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
/* The Algorithm is applicable for all the data types */
    public static void revWithoutInbuilt(String[] arr){
        String [] b = new String[arr.length];
        int j = arr.length-1;

       /* Using Collection Frame work */
//        Collections.reverse(Arrays.asList(arr));
//        Arrays.stream(arr).forEach(System.out::println);

        for (int i = 0; i < arr.length; i++) {
            b[j] = arr[i];
            j-=1;
        }
        System.out.println("Reversed array is ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};
//        revWithoutInbuilt(arr);
        String [] arr2 = {"HEllo" , "Everyone", "Here"};
        revWithoutInbuilt(arr2);



    }
}
