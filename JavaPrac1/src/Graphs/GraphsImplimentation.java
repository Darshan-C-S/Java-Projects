package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class GraphsImplimentation {
    public static void main(String[] args) {
        int v = 6;
        int e = 10;
//     Represent Graph in Metrics
        int a[][] = new int[v+1][v+1];

        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();

/* Initializes an empty list for each vertex, including an extra one to match the matrix representation.*/
        for (int i = 0; i <= v; i++) {
              ar.add(new ArrayList<Integer>());
        }

    }

//    Note This is bi directional Graph
    static void edge(int a[][] , int source , int destination){
        a[source][destination] = 1;
        a[destination][source] = 1;
    }

    static void edge(ArrayList<ArrayList<Integer>> arr , int source , int destination){
        arr.get(source).add(destination) ;
        arr.get(destination).add(source);
    }

}
