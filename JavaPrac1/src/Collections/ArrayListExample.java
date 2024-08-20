package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ArrayListExample {
    public static void main(String[] args) {
        // Declaration of ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements using get() method
        System.out.println("Fruits: " + fruits);
        System.out.println("Second fruit: " + fruits.get(1)+fruits.get(2)); // Accessing the second element

        // Updating element using set() method
        fruits.set(0, "Apple");
//        fruits.set(4,"Dragon Fruit"); this set method gives array index out of bounds as the element
//        of size 4 is not added so no memory is present
        System.out.println("Updated fruits: " + fruits);

        // Removing element using remove() method
        fruits.remove(2);
        System.out.println("Fruits after removing: " + fruits);

        // Checking size and isEmpty()
        System.out.println("Size of fruits: " + fruits.size());
        System.out.println("Is fruits list empty? " + fruits.isEmpty());

        // Checking if list contains an element
        System.out.println("Does fruits contain 'Apple' and 'Dragon Fruit'? " + fruits.contains("Apple")+fruits.contains("Dragon Fruit"));


        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);

        List<Integer> noLists = Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer> evenList = noLists.stream().filter(x->x%2 ==0).collect(Collectors.toList());
        System.out.println("Even List is : "+evenList);

        int sum = list.stream().reduce(0, (a,b) ->a+b );
        System.out.println("the sum of the element of array "+ sum);

        for (int i = 0; i<list.size();i++){
            System.out.println("The elements of the list are: "+list.get(i));
        }

        for(Integer element: list){
            System.out.println("Elements of list taken from for each loop: "+element);
        }

        for (Integer ele :list){
            System.out.println("The second element taken is : "+ele);
        }

        CopyOnWriteArrayList <Integer> arrayList = new CopyOnWriteArrayList<>();

    }
}