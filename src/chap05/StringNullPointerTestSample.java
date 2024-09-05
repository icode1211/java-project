package chap05;

/**
 * NullPointerException 발생 코드
 */
public class StringNullPointerTestSample {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str.equals("비교하려는값"));
    }
}
