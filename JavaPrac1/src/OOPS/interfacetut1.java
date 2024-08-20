package OOPS;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface A {
    void printVoid();
}
/*The usage  of the functional interface is to have single interface method, that can be defined anywhere
* by a Anonymous class or mainly by a lambda expression
*
* And as per SOLID principle where it's best to segregate the interface with single functionality and
* make interfaces as small as possible
* (Interface Segregation Principle)
*
*
* https://chatgpt.com/c/e30fab33-cdcd-4ea8-a021-6670aa742e1e
* */

@FunctionalInterface
interface B{
    void printB();
}
@FunctionalInterface
interface Add{
    void AddNo(int a , int b);
}

@FunctionalInterface
interface Multiply3No{
    int Mullu(int a , int b , int c);
}
@FunctionalInterface
interface calculate{
    void calculateNo(int a , int b);
}
public class interfacetut1 {
    public static void main(String[] args) {


        B b = () -> {
            System.out.println("Print void in lambda");
        };

      b.printB();

// use lambdas to implement functional interfaces
        Add h  = (int c,int d)->{
         int l = c+d;
          System.out.println(l);
      };
      h.AddNo(18,8);

      Multiply3No multiply3No = (int a1 , int b1, int c1) ->{
          int su = a1*b1*c1;
          return su;
      };

      int mullres = multiply3No.Mullu(10,20,30);
      System.out.println("The multiplication of 3 no are : "+mullres);


      calculate mul = (x,y) ->{
          System.out.println(x*y);
      };
      mul.calculateNo(2,4);

      // Lambdas in list using streams
        List<Integer> arr = Arrays.asList(1,2,3,4,5,6);
        List<Integer> evenList = arr.stream().filter(x-> x%2 == 0).collect(Collectors.toList());
        System.out.println(evenList);


    }
}
