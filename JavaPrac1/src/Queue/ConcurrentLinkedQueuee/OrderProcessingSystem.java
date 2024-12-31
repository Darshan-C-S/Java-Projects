package Queue.ConcurrentLinkedQueuee;

import java.util.concurrent.ConcurrentLinkedQueue;

public class OrderProcessingSystem {

    private static final ConcurrentLinkedQueue<String> orderQueue = new ConcurrentLinkedQueue<>();

    static class OrderProducer implements Runnable{

        private int producerId;

        public OrderProducer(int producerId){
            this.producerId = producerId;
        }

        @Override
        public void run() {
            for (int i = 0; i <= 5 ; i++) {
                String Order = "Order-"+producerId+"-"+i;
                orderQueue.add(Order);
                System.out.println("For producer : "+ producerId + " the order is : "+Order);
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }

            }
        }
    }

    static class OrderConsumer implements Runnable{

        private int ConsumerID;

        public OrderConsumer(int ConsumerID){
            this.ConsumerID = ConsumerID;
        }

        @Override
        public void run() {
            while (true){
                String Order = orderQueue.poll();

                if(Order != null){
                    System.out.println("Order Consumed for consumer "+ ConsumerID + " is : "+Order);
                }
                else {
                    try {
                        Thread.sleep(50);
                    }catch (InterruptedException e){
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread producer1 = new Thread(new OrderProducer(1));
        Thread producer2 = new Thread(new OrderProducer(2));

        Thread consumer1 = new Thread(new OrderConsumer(1));
        Thread consumer2 = new Thread(new OrderConsumer(2));

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        consumer1.interrupt();
        consumer2.interrupt();


    }

}
