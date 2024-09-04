package chap04;

/**
 * for each 반복문
 */
public class ForEachLoop {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three", "four"};

        for (String number : numbers) {
            System.out.println(number);
        }
    }
}
