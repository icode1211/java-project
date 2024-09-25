package chap13;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * 13.1 스트림 객체 생성
 */
public class StreamExample {
    public static void main(String[] args) throws IOException {
        // 1. 컬렉션으로 스트림 객체 생성
        List<String> list = Arrays.asList("1", "2", "3", "4");
        Stream<String> stringStream = list.stream();

        // 2. 배열로 스트림 생성
        String[] array = {"1", "2", "3", "4"};
        Stream<String> stringStream2 = Arrays.stream(array);

        // 3. 숫자 범위 스트림 생성
        IntStream intStream = IntStream.rangeClosed(1, 5);  // [1,2,3,4,5]
        LongStream longStream = LongStream.range(1, 5);      // [1,2,3,4]
        DoubleStream doubleStream = DoubleStream.of(1, 2, 3); // [1.0, ...]

        // 4. 파일을 통한 스트림 생성
        Stream<String> fileStream = Files.lines(Paths.get("file1.txt"), Charset.forName("UTF-8"));
        fileStream.forEach(System.out::println);

        // 5. 스트림 연결해서 하나의 스트림 생성
        Stream<Integer> intStrem1 = Stream.of(1, 2, 3);
        Stream<Integer> intStream2 = Stream.of(4, 5, 6);
        Stream<Integer> concated = Stream.concat(intStream2, intStrem1);
        concated.forEach(System.out::println);
    }
}
