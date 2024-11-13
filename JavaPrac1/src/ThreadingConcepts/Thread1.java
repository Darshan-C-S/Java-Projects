package ThreadingConcepts;

public class Thread1 {
    public static void main(String[] args) {

// If you usw .start will is trying to run concurrently use .join will make sure the thread is completed the process
// If there are multiple threads started we can arrange the order of .join as per desired order of thread execution
// but the .join is making it sequential as it waits for the initial threads to complete

       for (int i=1; i<=5; i++ ) {
           // i is having the thread no
           Thread multhreadRun = new Thread(new MultiThreadThing(i));
           multhreadRun.start();

           try {
               multhreadRun.join();
           }catch (Exception e){
               System.out.println(e);
           }

//          multhreadRun.run();
          // multhreadRun.isAlive(); //used to check wather the thread is alive

//           multiThreadThing.start();


//           try {
//               multhreadRun.join(); //join will wait for the first thread to complete and start the new thread
//           }catch (Exception e){
//
//           }
       }


        /* difference bw thread.start and thread.run is if there are multiple thread running
                                the start will run the threads together and run will run simultaneously , so use start to
                                run multiple threads concurrently  */



/*A race condition is an undesirable situation that occurs when a device or system attempts to perform two or more
operations at the same time, but because of the nature of the device or system, the operations must be done in the
proper sequence to be done correctly*/

/*A Deadlock is a situation that involves the interaction of more than one resource and process with each other.
We can visualize the occurrence of deadlock as a situation where there are two people on a staircase.*/



    }
}
