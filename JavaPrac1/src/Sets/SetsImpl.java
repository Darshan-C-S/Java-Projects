package Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetsImpl {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Darshan");
        names.add("Superman");
        names.add("Thor");
        names.add("Ironman");
    for(String name : names){
        System.out.println(name); //looping in for as well as lambda expression
    }
      names.forEach(System.out::println);
      List<Integer> numberlist = new ArrayList<>();
      numberlist.add(1);
        numberlist.add(2);
        numberlist.add(3);
        numberlist.add(4);
        System.out.println(numberlist);  // we can use set to remove the duplicates in the list



    }



}
