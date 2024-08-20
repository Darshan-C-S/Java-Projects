package Queue;

// https://chatgpt.com/c/824f2182-19e9-4c25-9edc-9fb881e8942c

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueImpl {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10); // if the queue is full than it Throws IllegalStateException
        q.offer(20); // Returns false if the queue is full

        System.out.println(q.peek());
        System.out.println(q.element());

        System.out.println(q.poll());
        System.out.println(q.remove());// remove returns exception while removing empty list and poll will give null
        System.out.println(q.poll());


        System.out.println(q.isEmpty());

        ConcurrentLinkedQueue<Integer> concurrentQueue = new ConcurrentLinkedQueue<>();





    }
}
