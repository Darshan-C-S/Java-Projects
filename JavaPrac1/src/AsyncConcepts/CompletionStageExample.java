package AsyncConcepts;

import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;

public class CompletionStageExample {
    public static void main(String[] args) {

        Scanner in  =  new Scanner(System.in);

//        This blok is used to perform the async operation
        CompletableFuture <String> future = CompletableFuture.supplyAsync(()->{
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            return " Hello";
        });

//        In this block we can apply any modification to the result we got from above operation
        CompletableFuture <String> resultFuture = future.thenApply(result -> result + " World").
                thenApply(result -> result + " !");

//        This block accept the final result and print it with exception if given
        resultFuture.thenAccept(result -> System.out.println("The result is == : "+result)).
                exceptionally(ex ->{
                    System.out.println("The exception is: "+ex.getMessage());
                    return null ;
        });


        try{
            resultFuture.get();
        }catch (InterruptedException | ExecutionException e){
            CompletableFuture.failedFuture(e);
            CompletableFuture.failedStage(e);
        }

        System.out.println("Enter the no to perform add operation in CompletebleFuture : ");

        Integer a = in.nextInt();
        Integer b = in.nextInt();

        CompletableFuture <Integer> future1 = CompletableFuture.supplyAsync(()->{
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            return a+b;

        });

        CompletableFuture<String> AddResult  = future1.thenApply(result -> result+10 ).
                thenApply(result -> "The result after adding two no and with 10 : "+result) ;
        AddResult.thenAccept(result -> System.out.println(result)).exceptionally(e ->{
                System.out.println(e.getMessage());
                return null;});

        try {
            AddResult.get();
        }catch (InterruptedException | ExecutionException e){
            CompletableFuture.failedFuture(e);
            CompletableFuture.failedStage(e);
        }


    }
}
