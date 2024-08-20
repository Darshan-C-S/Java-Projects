package DSA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOps {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C"));
        Set<String> set2 = new HashSet<>(Arrays.asList("B","C","D"));


        //the union operation
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);//.add for single set element and addAll for the complete set object
        System.out.println(union);

        //Intersection operation
        Set<String> Intersection = new HashSet<>();
        for(String element :set1){
            if(set2.contains(element)){
                Intersection.add(element);
            }
        }
        System.out.println(Intersection);

        //Difference operation
       Set<String> DiffrenceSet = new HashSet<>();
        for(String element : set1){
//            remove all the common elements present in set1  inside set 2
            if(!set2.contains(element)){
                DiffrenceSet.add(element);
            }
        }

//        same as above
        Set<String> diff2 = new HashSet<>();
        set1.removeAll(set2);
        diff2.addAll(set1) ;
        System.out.println("Diff is : "+diff2);


        //Symmetric difference
        Set<String> Symetric = new HashSet<>(set1);
        Symetric.removeAll(set2);
//        System.out.println(DiffrenceSet);
        Set<String>dft = new HashSet<>(set2);
        dft.removeAll(set1);
        Symetric.addAll(dft);
        System.out.println(Symetric);



    }
}
