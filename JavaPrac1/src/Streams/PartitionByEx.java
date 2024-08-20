package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByEx {
    public static void main(String[] args) {
/* The partitioningBy method in Java is part of the Collectors
utility class and is used to partition the elements of a stream
into two groups based on a given predicate. This method returns a Map<Boolean, List<T>>,
where the key is a Boolean indicating the result of the predicate (true or false), and the value is a
list of elements for which the predicate is true or false.
Let's use the partitioningBy method to separate even and odd values from a list of integers.
* */
        List<Integer> li = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean, List<Integer>> PartitionByLis =  li.stream().collect(Collectors.partitioningBy(a -> a%2==0));

        List<Integer> evenlis = PartitionByLis.get(true);
        List<Integer> oddlis = PartitionByLis.get(false);
        System.out.println("Even list is : ");
        for(int i : evenlis){
            System.out.println(i);

        }
        System.out.println("Odd list is : ");
        for (int i: oddlis){
            System.out.println(i);
        }

        Map<Boolean,List<Integer>> DivisibleBy5 = li.stream().collect(Collectors.partitioningBy(x->x%5 ==0));

        List<Integer> Div5 = DivisibleBy5.get(true);
        List<Integer> NotDev5 = DivisibleBy5.get(false);

        System.out.println("========= no Divisible by 5 =============");
        for(Integer i : Div5){
            System.out.println(i);
        }
        System.out.println("==== no not Divisible by 5 ====");
        for (Integer i : NotDev5){
            System.out.println(i);
        }

    }
}
