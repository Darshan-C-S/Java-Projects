package Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOps {
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList (1, 2, 3))  ;
        HashSet<Integer> set2 =new HashSet<>(Arrays.asList (3, 4, 5)) ;

//        Union of two set

//        for (int i : set1){
//            set2.add(i);
//        }
//  or
        Set<Integer>unian = new HashSet<>(set2);
        unian.addAll(set1);
        System.out.println("The unian set is : "+ unian);

//        Intersection of set

        Set<Integer>Intersection = new HashSet<>(set1);
//        Intersection.retainAll(set2);
//        System.out.println("Intersection of Set : "+Intersection);
        System.out.print("The intersection : ");
        Intersection.stream().filter(set2::contains).forEach(System.out::println);

//        Difference set

        Set<Integer>diff = new HashSet<>(set1);

        for(int i : diff){
            if(set2.contains(i)){
                diff.remove(i);
            }
        }
        System.out.println("Difference : "+diff);

//        Symmetric Difference

        Set<Integer> symetricDiff = new HashSet<>(set1);
        Set<Integer> ansSymetric = new HashSet<>(set2);
        ansSymetric.removeAll(set1);
        symetricDiff.removeAll(set2);
        ansSymetric.addAll(symetricDiff);
        System.out.println("Symmetric diff : " + ansSymetric);



    }
}
