package chap13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 13.4 매핑 map(), flatmap()
 */
public class MappingExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
        list.stream()
                .map(element -> element.toUpperCase())
                .forEach(System.out::print);        // ABCDE

        System.out.println("\n===============");
        // flatmap   2차원 -> 1차원
        Integer[][] array = {{3,4},{1,2}};
        Arrays.stream(array)
                .flatMap(element -> Arrays.stream(element))
                .forEach(System.out::print);      // 3412

        System.out.println("\n===============");
        // flatmap
        List<String> sentences = Arrays.asList("Hello World", "Java stream");
        List<String> collect = sentences.stream()
                .flatMap(element -> Arrays.stream(element.split(" ")))
                .collect(Collectors.toList());
        System.out.println(collect);    // [Hello, World, Java, stream]
    }
}
