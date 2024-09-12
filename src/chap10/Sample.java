package chap10;

import java.util.ArrayList;

/**
 * 제네릭 사용/사용하지 않았을 때 차이 비교
 */
public class Sample {
    public static void main(String[] args) {
        // 제네릭
        ArrayList<String> list = new ArrayList<>();
        list.add("10");
        list.add("12.45");
        list.add("문자열");
        String str = list.get(2); // 제네릭 사용시 지정 타입(String)으로 자동 변환


        // 제네릭 사용하지 않았을 경우
        ArrayList list2 = new ArrayList();
        list2.add("10");
        list2.add(12.45);       // 잘못된 타입이 들어갈 가능성
        list2.add("문자열");
        String str2 = (String) list2.get(2);    // 타입 변환(casting) 필요
    }
}
