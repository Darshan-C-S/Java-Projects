package leetCodeAndHackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> res = new ArrayList<>();


        int max = Arrays.stream(candies).max().getAsInt();


        for(int i : candies){
            if((i+extraCandies)>= max){
                res.add(true);
            }else {
                res.add(false);
            }
        }

        return res;

    }
    public static void main(String[] args) {

    }
}
