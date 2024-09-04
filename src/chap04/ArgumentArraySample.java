package chap04;

import java.util.ArrayList;

/**
 * java arguments로 입력받은 args배열 출력하기
 * (반드시 for문 이용)
 */
public class ArgumentArraySample {
    public static void main(String[] args) {  // 10 12 13 14 18 20
        // for문
        for (int index = 0; index < args.length; index++) {
            System.out.println(args[index]);
        }

        System.out.println("-------------");

        // for each문
        for (String arg : args) {
            System.out.println(arg);
        }

        System.out.println("------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
