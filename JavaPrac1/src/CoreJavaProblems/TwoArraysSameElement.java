package CoreJavaProblems;

import java.util.Arrays;
import java.util.HashSet;

/* Here this algorithm is used to check if two arrays are having the same element */
public class TwoArraysSameElement {
    public static boolean compareTwoArray(Object [] a , Object []b){
        HashSet<Object> a1 = new HashSet<>(Arrays.asList(a));
        HashSet<Object> a2 = new HashSet<>(Arrays.asList(b));

        if(a1.size()!= a2.size()) return false;

        for(Object n: a1){
            if(!a2.contains(n)) return false;

        }
        return true;
    }

    public static void main(String[] args) {

        Object [] a = {1,2,3,4,5,6};
        Object [] b = {1,2,3,4,5,6};
        if(compareTwoArray(a,b)){
            System.out.println("The arrays are equal");
        }else {
            System.out.println("The arrays are not equal");
        }



    }
}
