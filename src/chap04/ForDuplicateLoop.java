package chap04;

/**
 * 이중 for문
 */
public class ForDuplicateLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {  // i = 0, 1, 2
            for (int j = 0; j < 4; j++) {  // j = 0, 1, 2, 3
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
