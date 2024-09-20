package chap11.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();
        map.put("spring", "qwer");   // (실제로는 암호화 처리해야하는 pw정보)
        map.put("sumer", "qwer1234");
        map.put("fall", "qwer123");
        map.put("winter", "qwe123");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("아이디를 입력하세요.");
            String id = scanner.nextLine();

            System.out.println("패스워드를 입력하세요.");
            String pw = scanner.nextLine();

            if (map.containsKey(id)) {
                if (map.get(id).equals(pw)) {
                    System.out.println("로그인 완료");
                    break;
                } else {
                    System.out.println("패스워드가 일치하지 않습니다");
                }
            } else {
                System.out.println("아이디가 일치하지 않습니다");
            }
        }
    }
}
