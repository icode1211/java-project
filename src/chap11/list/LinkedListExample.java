package chap11.list;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        // 1. LinkedList 값 추가
        List<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Spring");
        list.add("Servlet/JSP");
        list.add("DBMS");
        list.add("JPA");

        // 2. 총 개수 출력
        System.out.println("총 개수 : " + list.size());

        // 3. 값 순회 하면서 출력
        for (int i = 0; i < list.size(); i++) {
            System.out.println("\t" + i + " : " + list.get(i));
        }

        // 4. 값 삭제
        list.remove(2);
        list.remove(2);

        // 5. 총 개수 출력
        System.out.println("총 개수 : " + list.size());

        // 6. 향상된 for문으로 순회하면서 값 출력
        for (String element : list) {
            System.out.println("\t" + element);
        }
    }
}
