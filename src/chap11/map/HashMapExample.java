package chap11.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // 1. map 객체 선언, key, value 값 추가
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("홍길동", 10);
        hashMap.put("윈터", 20);
        hashMap.put("윈터", 30);

        System.out.println(hashMap.get("key"));
        // key에 해당하는 값이 없을 경우 default value 값 리턴 - getOrDefault()
        System.out.println(hashMap.getOrDefault("key", 0));

        System.out.println(hashMap.size());

        // 2. 각 key, value 순회하면서 출력  -> keySet() 메소드 사용
        Set<String> keySet =  hashMap.keySet();
        for (String key : keySet) {
            Integer value = hashMap.get(key);
            System.out.println(key + " : " + value);
        }

        // 3. 각 key, value 순회하면서 출력  -> entrySet() 메소드 사용
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("\t" + entry.getKey() + " : " + entry.getValue());
        }

    }
}
