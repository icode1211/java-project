package chap10.limit;

/**
 * 제한된 타입 파라미터 사용해보기
 */
public class BoundedTypeExample {
    public static void main(String[] args) {
        int result = Util.compare(1, 2);
        System.out.println(result);

        int result2 = Util.compare(4.5, 1.2);
        System.out.println(result2);

        int result3 = Util.compare(3, 3);
        System.out.println(result3);
    }
}
