package chap10.implement;

import java.util.ArrayList;

/**
 * 인터페이스 구현클래스(제네릭) 사용
 */
public class ImplementExample {
    public static void main(String[] args) {
        StorageImpl<String> storage = new StorageImpl<>(10);
        storage.add("첫번째", 0);
        storage.add("두번째", 1);
        storage.add("세번째", 2);

        String result = storage.get(1);
        System.out.println(result);

        ArrayList<String> storageList = new ArrayList<>();
        storageList.add(0, "문자열1");
        storageList.add(1, "문자열2");
        storageList.get(1);
    }
}
