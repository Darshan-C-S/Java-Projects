package Sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetInArrayList {
    public static List<Integer> ArryAsSet(List<Integer> arr){

        List<Integer> arr2 = new ArrayList<>();
/* Here we itirate through the element of the input array and check if the element exist in the resulting array
* If it doesn't we will add the element */
        for(Integer a :arr){
            if(!arr2.contains(a)){
                arr2.add(a);
            }
        }
        return arr2;
    }

    public static void main(String[] args) {

        List<Integer>samp = Arrays.asList(1,2,3,3,3,4,5,6,6,7);
        System.out.println(ArryAsSet(samp));

    }
}
