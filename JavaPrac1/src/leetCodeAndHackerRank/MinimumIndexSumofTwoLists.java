package leetCodeAndHackerRank;

import java.util.ArrayList;

public class MinimumIndexSumofTwoLists {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> a = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {

                if (list1 [i].equals( list2[j])){
                    if((i+j) < min){
                        min = (i+j);
                        a.clear();
                        a.add(list1[i]);
                    } else if ((i+j) == min) {
                        a.add(list1[i]);
                    }
                }

            }
        }
        return a.toArray(new String[0]);
        
    }


    public static void main(String[] args) {

    }
}
