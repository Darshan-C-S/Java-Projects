package ExecuterServices;

import ThreadingConcepts.ThreadExample;

import java.util.concurrent.*;

public class ExecutorServiceExample {
    public static void main(String[] args) {

        ExecutorService executorService =  Executors.newFixedThreadPool(2);

        Runnable runnable = () -> {
            System.out.println("This is the Runnable task executed ");
        };

        Callable<String> callable =()->{
            Thread.sleep(2000);
            return "The callable task executed ";
        };

        executorService.submit(runnable);

        Future<String> future = executorService.submit(callable);

        try {
            System.out.println("Waiting for Callable task to be executed  .....");
            String res = future.get();
            System.out.println(res);

        }catch (ExecutionException | InterruptedException e){
            e.printStackTrace();
        }

        executorService.shutdown();
        System.out.println("Executor service is Shut down ");





    }
}
