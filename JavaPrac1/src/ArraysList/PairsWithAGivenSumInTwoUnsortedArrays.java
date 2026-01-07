package ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairsWithAGivenSumInTwoUnsortedArrays {

    public static  int[] findPairs(int [] a , int [] b , int tar){
        Arrays.sort(a);
        Arrays.sort(b);
        int m = a.length;
        int n = b.length;
        List<Integer> res = new ArrayList<>();

        int i = 0 , j = n-1;

        while (i < m && j >=0){
            int sum  = a[i] + b [j];
            if( sum == tar){
                res.add(a[i] );
                res.add(b[j]);
                i++;
                j--;
            }else if(sum < tar){
                i++;
            }else {
                j--;
            }
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 7, 5, 4 };
        int arr2[] = { 0, 7, 4, 3, 2, 1 };
        int x = 8;
        int [] res = findPairs(arr1, arr2,  x);

        Arrays.stream(res).forEach(System.out::println);


    }
}
