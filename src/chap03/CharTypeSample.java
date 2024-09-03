package chap03;

/**
 * 이항연산자 - char 타입으로 사칙연산
 */
public class CharTypeSample {
    public static void main(String[] args) {
        // char 타입
        char c1 = 'A' + 1;   // 'B' (유니코드 66은 문자 B)
        System.out.println("c1 = " + c1);

        char c2 = 'A';
//        char c3 = c2 + 1;   // 에러
    }
}
