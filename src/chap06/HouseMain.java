package chap06;

import chap06.house.HouseKim;

/**
 * default 접근 제어자 확인
 * (HouseKim 클래스의 lastname 접근제어자)
 */
public class HouseMain {
    public static void main(String[] args) {
        HouseKim kim = new HouseKim();
//        kim.lastname;     // 다른 패키지에 있는 lastname 접근 불가
    }
}
