package chap04;

/**  구구단 프로그램 구현해보기
 2 4 6 8 10 ... 18
 3 6 9 ...      27
 .
 .
 9 18 ...       81
*/
public class GooGooDanProgram {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {  // 2 ~ 9
            for (int j = 1; j <= 9 ; j++) {  // 1 ~ 9
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }
}
