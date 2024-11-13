package ThreadingConcepts;



//public class MultiThreadThing extends Thread{

/*
* Always prifer to implement runnable interface over extending thread class as it will allow multiple inheritance
* on the MultiThreadThing class
* */
public class MultiThreadThing implements Runnable {

    private int threadNo;


    public MultiThreadThing(int threadNo ){
        this.threadNo = threadNo;

    }

    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.println(i +" from Thread no " + threadNo);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

    }
}
/*We can use runnable interface as well to run the thread by calling thread class in the main class the main
advantage of the runnable interface is that it can be used to have multiple inheritance  */