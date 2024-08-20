package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PraacticeClass {
    public static void main(String[] args) {


        List<Integer> lst = Arrays.asList(1,2,3,4,5,4,5,5);
        List<Integer> lst2 = new ArrayList<>();

        for(int i : lst){
            if(!lst2.contains(i)){
                lst2.add(i);
            }
        }

        System.out.println(lst2);

    }
}
