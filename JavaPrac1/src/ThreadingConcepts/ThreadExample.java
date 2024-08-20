package ThreadingConcepts;


 class PrintNo implements Runnable{

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println(i);

            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}

 class PrintAlphabets implements Runnable {
     public void run(){
         try {
             for (char i = 'a'; i < 'j'; i++) {
                 Thread.sleep(1000);
                 System.out.println(i);
             }
         }catch (InterruptedException e){
             Thread.currentThread().interrupt();
         }
     }

}

public class ThreadExample {
    public static void main(String[] args) {

        Thread t1 = new Thread(new PrintNo());
        Thread t2 = new Thread(new PrintAlphabets());

        t1.start();
        t2.start();

        try {
            t2.join();
            t1.join();

        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }


    }
}
