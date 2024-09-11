package chap09;

/**
 * NumberFormatException 예외 발생 코드
 * (Unchecked Exception)
 */
public class NumberFormatExample {
    public static void main(String[] args) {
        String invalidNumber = "abc";
        try {
            int num = Integer.parseInt(invalidNumber);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
