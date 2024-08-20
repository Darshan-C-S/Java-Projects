package DSA;

import java.util.*;
import java.util.stream.Collectors;

public class NthHigestNoOfList {
    static int NthHigestNo (List<Integer>list ,  int target){
        try{
            List<Integer> SortedDistinct = list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            //here we are using the comparitor.reverce order to make the the list in decending order
            int nthele = SortedDistinct.get(target-1);

            return nthele;
        } catch (Exception e){
            System.out.println(e);
        }
        return -1;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("The input no is : ");
        int no = in.nextInt();
        List<Integer> ls = Arrays.asList(1,2,3,3,1,1,4,4,6,6,5,5,5,5,7,8,9,9,10,10,11,11);
        int pos = NthHigestNo(ls ,no );
        System.out.println(ls.stream().filter(x -> x%4 ==0).collect(Collectors.toList()));
        System.out.println(pos);
        

    }
}
