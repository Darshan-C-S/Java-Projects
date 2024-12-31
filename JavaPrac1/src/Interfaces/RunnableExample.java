package Interfaces;


public class RunnableExample {
    public static void main(String[] args) throws Exception {
       Runnable task = () -> {
           System.out.println("Hello all");
       } ;

       Thread thread = new Thread(task);

       thread.start();

    }
}
