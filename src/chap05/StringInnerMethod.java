package chap05;

/**
 * 문자열(String) 내장 메소드 실습
 */
public class StringInnerMethod {
    public static void main(String[] args) {
        String hello = "Hello Java";

        int index = hello.indexOf("J");         // 6
        char character = hello.charAt(index);   // J

        hello.charAt(hello.indexOf("J"));   // J

        // replaceAll()
        String hello2 = "Hello Java Java";
        String replaceStr = hello2.replaceAll("Java", "everyone");
        System.out.println(replaceStr);

        // substring()
        String hello3 = "Hello everyone everyone";
        hello3.substring(8, 13);   // eryon
        hello3.substring(8);    // eryone everyone

        // toUpperCase(), toLowerCase()
        String hello4 = "Hello World!";
        System.out.println(hello4.toUpperCase());
        System.out.println(hello4.toLowerCase());

        // trim()
        System.out.println("         hello4.   trim(): ".trim());
    }
}
