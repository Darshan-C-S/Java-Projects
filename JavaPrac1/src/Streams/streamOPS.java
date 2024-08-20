package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class streamOPS {



//    public static long countHigestValueInList(List<Integer> numbers) {
//
//        List<Integer> sortedList = numbers.stream().sorted(Comparator.reverseOrder()).toList();
//
//        long higestNo = sortedList.get(0);
//
//        long countH =  sortedList.stream().filter(n -> n == higestNo).count();
//
//
//        return countH;
//
//    }



    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(6,6,6,3,2,4,5,1,4);//List.of(6,6,6,3,2,4,5,1,4) also can be used to initialise the array list
        countHigestNLowenstValueInList(number);
        number.stream()
                .filter(n-> n%2 == 0)
                .sorted()
                .map(n->n*2)
                .forEach(n -> System.out.println(n));


        int res  = number.stream()
                .filter(n-> n%2 == 0)
                .sorted()
                .map(n->n*2).reduce(0, (c,a)->c+a);

        List<Integer> odd = number.stream().filter(x->x%2!=0).collect(Collectors.toList());
        List<Integer> even = number.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println("Odd list "+odd);
        System.out.println("Even List "+ even);

        System.out.println("addition of all redused no: "+res  );




       // System.out.println("the no of higest value in the list "+ cnt  );


        //strNo.map(n->n*2).forEach(n -> System.out.println(n));




    }

    private static void countHigestNLowenstValueInList(List<Integer> number) {

        List<Integer> SortList = number.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        int HigestValue = SortList.get(0);
        int lowestValue =  SortList.get(SortList.size()-1);

        long HigestCount = SortList.stream().filter(x -> x ==  HigestValue).count();
        long LowestCount = SortList.stream().filter(x->x==lowestValue).count();

        System.out.println( "Highest Count : "+HigestCount+" Lowest Count : "+LowestCount);

    }
}
