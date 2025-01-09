package leetCodeAndHackerRank;

import java.util.*;

public class DetermineIfTwoStringsAreClose {
    public static boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        // Create two frequency maps for word1 and word2
        Map<Character, Integer> mp1 = new HashMap<>();
        Map<Character, Integer> mp2 = new HashMap<>();

        // Fill the frequency maps
        for (int i = 0; i < word1.length(); i++) {
            mp1.put(word1.charAt(i), mp1.getOrDefault(word1.charAt(i), 0) + 1);
            mp2.put(word2.charAt(i), mp2.getOrDefault(word2.charAt(i), 0) + 1);
        }

        if(!mp1.keySet().equals(mp2.keySet())){
            return false;
        }

        // Sort and compare the values (frequency counts)
        List<Integer> freq1 = new ArrayList<>(mp1.values());
        List<Integer> freq2 = new ArrayList<>(mp2.values());

        Collections.sort(freq1);
        Collections.sort(freq2);

        return freq1.equals(freq2);

    }


    public static void main(String[] args) {

        String Word1 = "cabbba";
        String Word2 = "abbccc";
        System.out.println(closeStrings(Word1 , Word2));


    }
}
