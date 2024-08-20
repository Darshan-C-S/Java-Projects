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
                    Thread.sleep(1000);
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



    }
}
