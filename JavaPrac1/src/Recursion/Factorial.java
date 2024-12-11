package Recursion;

public class Factorial {
    public static int fact(int no){
        if(no <= 2){
            return no;
        }
        return no*fact(no-1);


    }

    public static void main(String[] args) {
        System.out.println(fact(3));

    }
}
