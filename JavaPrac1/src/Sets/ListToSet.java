package Sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSet {
    public static void main(String[] args) {

        List<Integer> lis = Arrays.asList(1,2,2,3,3,4,5,5,6);

        Set<Integer> set = lis.stream().collect(Collectors.toSet());

        List<Integer> dist = new ArrayList<>();
        for(int i : lis){
            if(!dist.contains(i)){
                dist.add(i);
            }
        }

        System.out.println(set);
        System.out.println(dist);

    }
}
