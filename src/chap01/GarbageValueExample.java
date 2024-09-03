package chap01;

public class GarbageValueExample {
    public static void main(String[] args) {
        byte a = 127;   // -128 ~ 127
        int b = 127;    // +- 20억
        for (int i = 0; i < 5; i++) {   // i = 0 ~ 4까지
            a++;
            b++;
            System.out.println(i + " a = " + a);
            System.out.println(i + " b = " + b);
        }

        // 문자
        char ch = 'C';

        // 문자열
        String str = "값을 표현할 수 있습니다.";
    }
}
