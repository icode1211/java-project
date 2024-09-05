package chap05;

/**
 * 문자열 포맷 (%s, %d, %f)
 */
public class StringFormat {
    public static void main(String[] args) {
        String str = ".........%s....특정문자%s사이값";
        System.out.println(String.format(str, "치환값1", "치환값2"));
        System.out.println(String.format(str, 4, 5));
        System.out.println(String.format(str, 46567.785, 5.234235));

        String str2 = "치환값1: %d .....치환값2: %d";
        System.out.println(String.format(str2, 7, 8));

        String str3 = "치환값1: %.18f .....치환값2: %.10f";
        System.out.println(String.format(str3, 4.5438972598439284, 6.7));
    }
}
