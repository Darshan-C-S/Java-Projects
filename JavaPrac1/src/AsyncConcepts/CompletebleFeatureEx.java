package AsyncConcepts;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;

public class CompletebleFeatureEx {
    public static void main(String[] args) {

//        Async process 1
        CompletableFuture <Void> future1 = CompletableFuture.runAsync(()->{
            for (int i = 0; i <10 ; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }

        });

//        Async Process 2
        CompletableFuture<Void> future2 = CompletableFuture.runAsync(()->{
            for (char i = 'a'; i <'k' ; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

//        Combine all the futures
        CompletableFuture<Void> combinetionFutrure = CompletableFuture.allOf(future2,future1);

        try{
            combinetionFutrure.get();
        }catch (InterruptedException | ExecutionException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("Both tasks are done in all of : !");


// Chaining multiple async operetions
        CompletableFuture<Integer> future12 = CompletableFuture.supplyAsync( () -> 10).
                thenApplyAsync(result -> result * 2).thenApplyAsync(result -> result +10);

        future12.thenAccept(res -> System.out.println("Result of Chaining Multiple async operations : "+res));



    }
}
