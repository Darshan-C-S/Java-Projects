package Sets;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Declaration of HashSet
        Set<String> names = new HashSet<>();

        // Adding elements to HashSet
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // Duplicate element, won't be added

        // Printing the set
        System.out.println("Names: " + names);

        // Removing an element from the set
        names.remove("Bob");
        System.out.println("Names after removing 'Bob': " + names);

        // Checking size and isEmpty()
        System.out.println("Size of names: " + names.size());
        System.out.println("Is names set empty? " + names.isEmpty());

        // Checking if set contains an element
        System.out.println("Does names contain 'Alice'? " + names.contains("Alice"));

        // Clearing the set
//        names.clear();
//        System.out.println("Names after clearing: " + names);

        for (String Name:names) {// itiration 
            System.out.println(Name);
        }
    }
}
