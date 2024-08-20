package DSA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctElementCatcher {
    public static void main(String[] args) {

        List<String> A = Arrays.asList("DCS","DCS");
        Set<String> S = new HashSet<>();
        S.addAll(A);
        System.out.println(S.stream().map(x -> x.toLowerCase()).collect(Collectors.toList()));


        System.out.println(A.stream().distinct().collect(Collectors.toList()));



    }
}
