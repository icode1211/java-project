package chap13;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 13.7 수집 collect()
 */
public class CollectExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5, 5);
        // 1 : 2개
        // 2 : 3개
        // 3 : 1개
        // 4 : 1개
        // 5 : 3개
        Map<Integer, Long> collected = list.stream()
                .collect(
                        Collectors.groupingBy(
                                n -> n,
                                Collectors.counting()
                        )
                );
        collected.forEach((key, value) ->
                System.out.println(key + " : " + value + "개"));
    }
}
