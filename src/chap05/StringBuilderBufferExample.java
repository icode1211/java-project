package chap05;

/**
 * 문자열 타입
 * String, StringBuilder, StringBuffer
 */
public class StringBuilderBufferExample {
    public static void main(String[] args) {
        String result = "";
        result += "Hello ";
        result += "Java ";
        result += "World!";
        System.out.println(result);

        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello ");
        buffer.append("Java ");
        buffer.append("World!");
        System.out.println(buffer);

        StringBuilder builder = new StringBuilder();
        builder.append("Hello ");
        builder.append("Java ");
        builder.append("World!");
        System.out.println(builder);

        // insert()
        System.out.println(builder.insert(0, "첫번째"));
        System.out.println(builder.insert(builder.length(), "오십번째다"));

        // substring()
        String substringResult = buffer.substring(6);       // Java World!
        String substringResult2 = buffer.substring(6, 7);       // J

        System.out.println(substringResult);
        System.out.println(substringResult2);
    }
}
