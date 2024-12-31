package LambdasPrac;

import java.util.Arrays;
import java.util.List;

public class LambdaPrac2 {
@FunctionalInterface
    interface lamdaCal1{
        void SingleVariableOps(int a);
    }
    @FunctionalInterface
    interface lambdaCal2{
        void multipleVarialbleOps(int a , int b);
    }

    public static void main(String[] args) {
// To declare the Lambda expression we use the interface type to declare the method type

        lamdaCal1 DoubleNo = (int x) -> System.out.println(x*2);
        DoubleNo.SingleVariableOps(10);


//   Here by using functional interface we are able to perform multiple types of lambda function
//   using single abstract method of lambdaCal2 multiple ways

        lambdaCal2 Multiply2No = (x,y) -> System.out.println("Multiplication operation on two no "+x*y);
        Multiply2No.multipleVarialbleOps(10,10);

        lambdaCal2 Add2No = (x,y) -> System.out.println("Addition operation on two no "+x+y);
        Add2No.multipleVarialbleOps(10,10);

//        Comparitor implimentation


        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");

        System.out.println("Sort in reverse order list is : ");

        names.sort((a , b) -> b.compareTo(a));
        System.out.println(names);



    }
}
