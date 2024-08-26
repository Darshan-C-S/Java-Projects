package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {


    public static void bfs(ArrayList<ArrayList<Integer>> adj , int startNode  ){
        boolean[]visited = new boolean[adj.size()];
        Queue<Integer>queue = new LinkedList<>();

        visited[startNode] = true;
        queue.add(startNode);

        while (!queue.isEmpty()){
            int currentNode = queue.poll();
            System.out.println(currentNode + " ");

            for( int neighbour : adj.get(currentNode)){
                if (!visited[neighbour]){
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }

        }

    }
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adjesencyList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adjesencyList.add(new ArrayList<>());
        }

        adjesencyList.get(0).add(1);
        adjesencyList.get(0).add(2);
        adjesencyList.get(1).add(3);
        adjesencyList.get(1).add(4);
        adjesencyList.get(2).add(4);

        bfs( adjesencyList, 0);


    }
}
