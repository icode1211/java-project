package chap02;

/**
 * 문자열 -> 숫자 변환
 */
public class StringConverter {
    public static void main(String[] args) {
        // String -> 숫자 변환
        String str = "12345";  // int/Integer
        int primitiveStr = Integer.parseInt(str);
        Integer wrapperStr = Integer.valueOf(str);

        // String -> long/Long
        long primitiveLong = Long.parseLong(str);
        Long wrapperLong = Long.valueOf(str);

        String value = "10000.345";
        // String -> float/Float
        float primitiveFloat = Float.parseFloat(value);
        Float wrapperFloat = Float.valueOf(value);

        // String -> double/Double
        double primitiveDouble = Double.parseDouble(value);
        Double wrapperDouble = Double.valueOf(value);

//        String str5 = "454875839545436L";
//        long primitiveLong2 = Long.parseLong(str5);

        String str6 = "12345.5F";
        float floatString = Float.parseFloat(str6);
        System.out.println("floatString = " + floatString);

        int intValue = 10;   // 10 -> "10"
        String s1 = intValue + "";
        String s2 = Integer.toString(intValue);
        String s3 = String.valueOf(intValue);

        System.out.println(intValue);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
