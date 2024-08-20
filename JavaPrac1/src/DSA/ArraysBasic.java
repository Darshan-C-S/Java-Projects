package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;


//https://chatgpt.com/c/1b80bcb1-f5d5-4a88-a97c-f9a8ce8237e7


public class ArraysBasic {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,5};


        int [] b = {1,2,3,4,5};


/*     if all the elements are same in both arrys then we get 0 if one element is same then we get
* -1 and if there are same elements and we are missing one or n no's then we get the no of missing elements  */
        System.out.println("Compare signed : "+Arrays.compare(a,b));


// Traversing the array
        for (int i=0 ; i<a.length;i++){
            System.out.println("Array elements are "+ a[i]);
        }

        for (int el : a){
            System.out.println("Array elements are by enhanced for loop "+el);
        }

//        Updating the array
        a[5] = 10;
        System.out.println("Type conversion to String from int after Update operation: "+Arrays.toString(a));
//        Find The Length
        System.out.println("length is :  "+a.length);
//        Copy the array
        int[] arr = Arrays.copyOf(a, a.length);


/*  Array methods */

//      Equals
        System.out.println(Arrays.equals(arr , a)); // True
        System.out.println(a == arr); // False

//      To string
        System.out.println("String type converted array : "+Arrays.toString(a));

    }
}
