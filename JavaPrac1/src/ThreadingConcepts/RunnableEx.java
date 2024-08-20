package ThreadingConcepts;


 class myRunnableThread implements Runnable{
    public  void run (){
        System.out.println("This is runnable statement ");
        try {
            Thread.sleep(5000);
            System.out.println("This is Thread statemnt");

        }catch (InterruptedException e){
           Thread.currentThread().interrupt();
        }
    }
}
public class RunnableEx {

    public static void main(String[] args) {
        Thread t1 = new Thread(new myRunnableThread());
        t1.start();
    }
}


