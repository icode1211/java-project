package chap11.set;

import chap10.wildcard.Person;

import java.util.*;

/**
 * Set 인터페이스의 구현체 HashSet 사용해보기
 */
public class HashSetExample {
    public static void main(String[] args) {
        // 1. 값 추가
        Set<String> hashSet = new HashSet<>();
        hashSet.add("카리나");
        hashSet.add("윈터");
        hashSet.add("카리나");

        // 2. 값 검색 (개수, 각 요소)
        System.out.println("총 개수: " + hashSet.size());

        for (String str : hashSet) {
            System.out.println("\t" + str);
        }

        System.out.println("=========================");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
            iterator.remove();
        }

        if (hashSet.isEmpty()) {
            System.out.println("비어있음 " + hashSet);
        }

        System.out.println("=========================");
        Person person1 = new Person("이름");
        Person person2 = new Person("이름");

        Set<Person> set = new HashSet<>();
        set.add(person1);
        set.add(person2);
        System.out.println(set.size());         // 1

        System.out.println("=========================");
        Member member1 = new Member("홍길동", 30);
        Member member2 = new Member("홍길동", 30);
        Set<Member> memberSet = new HashSet<>();
        memberSet.add(member1);
        memberSet.add(member2);
        System.out.println(memberSet.size());   // name, age값이 같을경우 같은 객체로 취급
    }
}
