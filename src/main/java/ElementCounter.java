

import java.util.*;
import java.util.function.Function;

public class ElementCounter {

    public static void main(String[] args) {
        List<Integer> example = List.of(0,1,2,3,4,5);
        ElementCounter elemCount = new ElementCounter();
        int numOdds = elemCount.oddNumberCounter(example, matchyBoi-> matchyBoi % 2 != 0);
        System.out.println(String.format("number of odd bois: %s", numOdds));
        long magic = example.stream().filter(matchyBoi-> matchyBoi % 2 != 0).count();
        System.out.println(String.format("yaldi %s", magic));
    }

    public <T> int oddNumberCounter(Collection<T> collectionOfNums, Function<T, Boolean> matchyBoi) {
        int count = 0;
        for(T boop: collectionOfNums) {
            if(matchyBoi.apply(boop))
                count++;
        }
        return count;
    }
}
