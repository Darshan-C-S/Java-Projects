package Dictionaryops;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap <String , Integer> concurrentHashMap = new ConcurrentHashMap<>();

        concurrentHashMap.put("A",1);
        concurrentHashMap.put("B",2);
        concurrentHashMap.put("C",9);
        concurrentHashMap.put("D",1);

        Thread thread1 = new Thread(() ->{
            for (int i = 0; i<100 ; i++){
                concurrentHashMap.put("A", concurrentHashMap.get("A")+1);
            }
        });
        Thread thread2 = new Thread(() ->{
           concurrentHashMap.put("C" , concurrentHashMap.get("C")/3);
        });
        Thread thread3 = new Thread(() ->{
            for (int i = 0 ; i<10 ; i++){
                concurrentHashMap.put("B",concurrentHashMap.get("B")*2);
            }
        });
        Thread thread4 = new Thread(()->{
           for (int i =0 ;i<4;i++){
               concurrentHashMap.put("D",concurrentHashMap.get("D")*4);
           }
        });


//        thread1.run();
//        thread2.run();
//        thread3.run();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread4.join();
            thread2.join();
            thread1.join();
            thread3.join();
        } catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Hash map after concurrent operation : "+concurrentHashMap);

    }
}
