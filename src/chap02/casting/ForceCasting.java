package chap02.casting;

public class ForceCasting {
    public static void main(String[] args) {
        int intValue = 10;
        char charValue = 'A';
        double doubleValue = 5.7;
        String stringValue = "A";

        // int -> double
        double doubleValue2 = (double) intValue;

        // String -> char  (캐스팅으로 변환은 X, 컴파일 오류 발생)
//        char var = (char) stringValue;

        // 가능하게 하려면 charAt(index) 라는 메소드를 사용해야합니다.
        char changedValue = stringValue.charAt(0);
    }
}
