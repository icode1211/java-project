package chap13;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 13.3 Stream 요소 필터링(distinct, filter)
 */
public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "b", "c", "c", "a");
        list.stream()
                .distinct()
                .forEach(System.out::print);    // abc 출력
        System.out.println("\n===============");
        List<String> sentences = Arrays.asList("김밥", "김밥", "김치", "나비", "나방");

        Set<String> set = sentences.stream()
                .filter(x -> x.startsWith("김"))
                .collect(Collectors.toSet());

        System.out.println(set);
        System.out.println("\n=============");
        String[] dupArray = {"김밥", "김밥", "김치", "나비", "나방"};
        Set<String> hashSet = Arrays.stream(dupArray).collect(Collectors.toSet());
        List<String> arrayList = Arrays.stream(dupArray).distinct().toList();
        System.out.println(hashSet);
        System.out.println(arrayList);
    }
}
