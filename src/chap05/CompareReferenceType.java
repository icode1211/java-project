package chap05;

/**
 * 5.3 참조타입 비교
 */
public class CompareReferenceType {
    public static void main(String[] args) {
        OutterClass outter = new OutterClass();
        OutterClass outter2 = new OutterClass();

        System.out.println("outter == outter2 결과: " + (outter == outter2));  // false

        String str1 = new String("문자1");
        String str2 = new String("문자1");
        System.out.println("str1 == str2 결과: " + (str1 == str2));      // false

        String str3 = "문자1";
        System.out.println("str1 == str3 결과: " + (str1 == str3));       // false
        String str4 = "문자1";
        System.out.println("str3 == str4 결과: " + (str3 == str4));       // true

        System.out.print("값만 비교해서 출력: ");
        System.out.print(str1.equals(str2) + "/");
        System.out.print(str1.equals(str3) + "/");
        System.out.println(str1.equals(str4));
    }
}
