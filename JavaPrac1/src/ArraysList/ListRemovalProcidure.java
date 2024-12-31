package ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListRemovalProcidure {
    public static void main(String[] args) {
        List<Integer> in  = new ArrayList<>(Arrays.asList(1,2,3,1,4));



        // If the data type is integer it only removes by the index
        in.remove(1);

        System.out.println(in);

        List<String> stringList = new ArrayList<>(Arrays.asList("AA","BB","CC"));
        System.out.println("Pre removing operations ");
        System.out.println(stringList);;

        // If the dataType is other than Integer we can specific the index as well as the object to be removed
        stringList.remove(1);
        stringList.remove("CC");
        System.out.println("Post removing : ");
        System.out.println(stringList);
    }
}
