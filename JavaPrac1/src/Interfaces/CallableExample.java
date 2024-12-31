

package Interfaces;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String > task = () -> {
            Thread.sleep(1000);
            return "Task Completed ";

        };

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(task);

        System.out.println("Waiting for the task to get completed");
        String message = future.get();
        System.out.println( message);

        executorService.shutdown();



    }
}
