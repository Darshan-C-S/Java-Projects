package Graphs;

import java.util.ArrayList;

public class DFS {
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj , boolean [] visited){

        visited [node] = true;
        System.out.println(node + " ");

        for(int neighbour : adj.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour , adj , visited);
            }
        }
    }
    public static void dfsDisconnected(int node, ArrayList<ArrayList<Integer>> adj){
        boolean [] visited = new boolean[adj.size()];

        for (int i = 0; i < adj.size(); i++) {
            if(!visited[i]){
                dfs(i , adj , visited);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        // Create a graph with two disconnected components
        adjacencyList.get(0).add(1);
        adjacencyList.get(0).add(2);
        adjacencyList.get(1).add(3);
        adjacencyList.get(4).add(5);
        adjacencyList.get(5).add(6);

       dfsDisconnected(0 , adjacencyList);


    }
}
