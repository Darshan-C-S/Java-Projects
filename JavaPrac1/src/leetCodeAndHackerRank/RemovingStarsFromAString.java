package leetCodeAndHackerRank;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class RemovingStarsFromAString {

    public String removeStars(String s) {

        Stack <Character> stack = new Stack<>();

        for (int i = 0; i <s.length() ; i++) {

            if(s.charAt(i) == '*'){
                stack.remove(stack.size() - 1); // check if element is * and remove the previous element added
            }else {
                stack.push(s.charAt(i));
            }

        }
        return stack.stream().map(a -> a.toString()).collect(Collectors.joining(""));

    }

    public static void main(String[] args) {




    }
}
