package DSA;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

public class LinkedListImpl {


    public static void main(String[] args) {
        LinkedList <String> NamesLinkedList = new LinkedList<>();
        NamesLinkedList.add("Darshan");
        NamesLinkedList.add("C S");
        NamesLinkedList.add("Shiva");
        NamesLinkedList.add("Krishna");
        System.out.println(NamesLinkedList.get(2));
//        System.out.println("Linked list "+NamesLinkedList);

/* To get the element from the index value its O(n) as it has to traverse the list to get the value
 But the Linked list is quicker to add and remove elements from specific location as it only have to change
 current and previous reference of the nodes with the new node, Faster write action */
        ArrayList <String> NamesList = new ArrayList<>();
        NamesList.add("Darshan");
        NamesList.add("C S");
        NamesList.add("Shiva");
        NamesList.add("Krishna");
        System.out.println(NamesList.get(2));
/* To get the element from the index value its O(1) ops as it can pick up value directly as per the index given
But to add a new element in the middle we need to create new array with the new size and copy the elements
 to the new list with the new element , Faster read action */

//        reversing a Linked list

        LinkedList <String> rv =   new LinkedList<>();
        rv.add("Hello");
        rv.add("live");
        rv.add("timeout");
        rv.add("Remove");
        LinkedList <String> rev = new LinkedList<>();
        rv.descendingIterator().forEachRemaining(rev::add);
        System.out.println(rev);

        Integer [] arr = {1,2,3,4,4,5,3,5};
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
        System.out.println(set);




    }
}
