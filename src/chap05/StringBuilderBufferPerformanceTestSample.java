package chap05;

/**
 * String , StringBuffer , StringBuilder 문자열 연결 수행시간 비교
 * (성능은 StringBuilder가 가장 좋음)
 */
public class StringBuilderBufferPerformanceTestSample {
    final static int LOOP_TIMES = 100_000;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < LOOP_TIMES; i++) {
            result += "Hello ";
            result += "Java ";
            result += "World!";
        }
        long end = System.currentTimeMillis();
        System.out.println("String 문자열 연결 수행시간: " + (end - start));


        long start2 = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < LOOP_TIMES; i++) {
            buffer.append("Hello ");
            buffer.append("Java ");
            buffer.append("World!");
        }
        long end2 = System.currentTimeMillis();
        System.out.println("StringBuffer 문자열 연결 수행시간: " + (end2 - start2));


        long start3 = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < LOOP_TIMES; i++) {
            builder.append("Hello ");
            builder.append("Java ");
            builder.append("World!");
        }
        long end3 = System.currentTimeMillis();
        System.out.println("StringBuilder 문자열 연결 수행시간: " + (end3 - start3));
    }
}
