package Stack;

import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;
import java.util.stream.Collectors;

public class StackImpl {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(50);
        stack.push(40);
        stack.push(60);
        stack.push(80);
        stack.push(70);


        System.out.println(stack.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        int min = stack.stream().sorted().collect(Collectors.toList()).get(0);
        int max  = stack.stream().sorted().collect(Collectors.toList()).get(stack.size()-1);

        System.out.println("The min is : "+min + " The max is : "+ max);

//        To remove all the elements in stack
        stack.removeAll(stack);
        System.out.println("The len after all elements removed "+ stack.size());

        // Create a stack
        Stack<Integer> stack2 = new Stack<>();

        // Push elements onto the stack
        stack2.push(10);
        stack2.push(20);
        stack2.push(30);

        // Peek the top element
        System.out.println("Top element: " + stack2.peek()); // Output: 30

        // Pop elements from the stack
        System.out.println("Popped element: " + stack2.pop()); // Output: 30
        System.out.println("Popped element: " + stack2.pop()); // Output: 20

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack2.isEmpty()); // Output: false

        // Search for an element
        System.out.println("Position of 10: " + stack2.search(10)); // Output: 1



    }
}
