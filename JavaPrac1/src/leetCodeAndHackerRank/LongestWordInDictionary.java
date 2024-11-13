package leetCodeAndHackerRank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestWordInDictionary {

    public static String longestWord(String[] words) {

        Map< Integer ,String> map = new HashMap<>();

        for(String s : words){
            map.put(s.length(), s);
        }
        List<Integer> set = map.keySet().stream().sorted().collect(Collectors.toList());

        return map.get(set.get(set.size() -1));

    }
    public static void main(String[] args) {

        String [] words = {"a","banana","app","appl","ap","apply","apple"};

        System.out.println(longestWord(words));

    }
}
