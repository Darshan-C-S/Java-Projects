package ThreadingConcepts;

import Streams.CollectorsImpl;

class counter{
    int count = 0;

    public synchronized void Incriment(){
        count++;
    }
    public int getCount(){
        return count;
    }

}
public class Synchronisations {

    public static void main(String[] args) {
        counter cnt = new counter();
        Thread t1 = new Thread(() ->{

            for (int i = 0; i < 10; i++) {
                cnt.Incriment();
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 20; i++) {
                cnt.Incriment();
            }
        });


        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println(cnt.getCount());

    }
}
