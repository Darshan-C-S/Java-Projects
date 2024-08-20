package LambdasPrac;

public interface lambdasPractice  {

    public static void printThing(PrintTh pr){

        pr.print("Darshan" , " Usage");
    }


    void Abstreactfun(int a);


    public static void main(String[] args) {
        System.out.println("Hello World");
//        printThing(() -> System.out.println("Hello Lambdas"));
        PrintTh lambdaVar = (a,b) -> System.out.println(a+" LambdaVariable "+b);
        printThing(lambdaVar);

//        Lambda prac 2

        lambdasPractice funcObj = (int x)-> System.out.println(x*10);
        funcObj.Abstreactfun(10);

    }




}
