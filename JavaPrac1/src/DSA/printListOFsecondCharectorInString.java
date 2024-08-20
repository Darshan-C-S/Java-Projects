package DSA;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class printListOFsecondCharectorInString {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hello","World","Name","your");

  List<Character> secondCharector = stringList.stream().map(s -> s.length()>=1?s.charAt(1):null).collect(Collectors.toList());
  System.out.println(secondCharector);

  Scanner in = new Scanner(System.in);
  System.out.println("Enter the position of the character : ");
  int n = in.nextInt();
  List<Character> nthCharector = stringList.stream().map(s->s.length()>=1?s.charAt(n-1):null).collect(Collectors.toList());
  System.out.println("The Character list from the position in the list of strings : "+nthCharector);

    }
}
