package leetCodeAndHackerRank;

import java.util.ArrayList;
import java.util.List;

public class EqualRowAndColumnPairs {

    public static List<Integer> getRows(int[][] grid , int in , int n){
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            li.add(grid[in][i]);
        }
        return li;

    }
    public static List<Integer> getColms(int[][] grid , int in , int n){
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            li.add(grid[i][in]);
        }
        return li;
    }

    public static int equalPairs(int[][] grid) {

        int cnt = 0;
        int n  = grid.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(getRows(grid , i , n).equals(getColms(grid , j ,n))){
                    cnt++;
                }
            }
        }
        return cnt;

    }
    public static void main(String[] args) {


        int [][] grid = {{3,2,1},{1,7,6},{2,7,7}};

        System.out.println(equalPairs(grid));



    }
}
