package leetCodeAndHackerRank;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {

    private static Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<>();

    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t-3000){
            queue.poll();
        }
        return queue.size();
    }




    public static void main(String[] args) {



    }
}
