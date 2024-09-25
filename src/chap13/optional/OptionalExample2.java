package chap13.optional;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 * NullPointerException을 방지할 수 있는 Optional 관련 메소드 사용해보기
 *  : ifPresent() 메소드 사용
 */
public class OptionalExample2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 7, 3);

        OptionalDouble optionalDouble = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                ;
        optionalDouble.ifPresent(System.out::println);
    }
}
