package ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ListBacicOperetions {
    public static void main(String[] args) {
//        Adding array element to the list without using inbuilt Array.asList
        List<Integer> lt = new ArrayList<>();
        int [] ai = {1,2,3,4};
        for(int i : ai){
            lt.add(i);
        }

        System.out.println(lt);

//        Adding array element to the list with inbuilt method

        List<Integer> li = Arrays.asList(1,2,3,4);
        System.out.println(li);



//        To get the elements of the list from position
        System.out.println(li.get(1));

//        To update the element in a given position , li.set will return the removed element
        System.out.println("The element getting removed : "+li.set(1,1));
        System.out.println("After updating/setting the element at pos 1 : "+li);

//        To remove the element we use .remove() which also returns the popped out element
        System.out.println(lt.remove(1));


/*          Iteration in the list                               */

        for(int i : lt){
            System.out.println(i);
        }

//      Reversing the list without inbuilt method
        List<Integer> rev1 = new ArrayList<>();
        for (int  i = li.size(); i>0;i--) {
            rev1.add(i);
        }
        System.out.println(rev1);

//       Iterating the list using  Iterator
        Iterator<Integer> it = li.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());

        }

//      To check if the element is in list
        boolean b = li.contains(2);
        boolean b1 = lt.contains(4);

        System.out.println("List1 has 2 : "+b + " List2 has 4 : "+ b1);




    }
}
