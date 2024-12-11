package leetCodeAndHackerRank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindTheHighestAltitude {

    public static int largestAltitude(int[] gain) {

        List<Integer> li1 = new ArrayList<>();

        int sum = 0;
        li1.add(sum);

        for (int i : gain){
            sum = sum + i;
            li1.add(sum);
        }
//        li1.sort(Integer::compareTo);

        return li1.get(li1.size()-1);


    }
     public static  int largestAltitudeIntuation(int[] gain){
        int tot = 0 , max = 0 ;

         for (int i = 0; i < gain.length; i++) {
             tot += gain[i];

             if(max < tot) max = tot;
         }
         return max;


     }
    public static void main(String[] args) {

        int [] arr  = {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        System.out.println(largestAltitude(arr));
        System.out.println(largestAltitudeIntuation(arr));

    }
}
