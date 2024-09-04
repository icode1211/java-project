package chap04;

public class ArrayExample {
    public static void main(String[] args) {
        // String[] 문자열 배열 선언, 값 저장
        String[] arrayString = new String[2];
        arrayString[0] = "첫번째";
        arrayString[1] = "두번째";
        System.out.println(arrayString[1]);

        // 선언, 초기화(값 저장)
        String[] arrayString2 = {"첫번째", "두번째"}; // 0,1
        System.out.println(arrayString2[0]);
        System.out.println(arrayString2[1]);
//        System.out.println(arrayString2[2]); // ArrayIndexOutOfBoundsException 발생

        System.out.println(arrayString2.length);
    }
}
