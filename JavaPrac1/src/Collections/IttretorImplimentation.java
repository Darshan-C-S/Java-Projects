package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IttretorImplimentation {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Cherry");
        list.add("Banana");

        ListIterator<String>it  = list.listIterator();
//        while (String i :  it){
//            System.out.println(it.next());
//        }
        for (int i = 0 ; i< list.size()-1 ; i++){
            if(list.get(i) == list.get(i+1)){
                System.out.println(list.get(i));
            }
        }
    }
}
