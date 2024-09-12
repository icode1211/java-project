package chap07.abstact;

public class PhoneExample {
    public static void main(String[] args) {
        // Phone phone = new Phone();   // 추상클래스 생성자로 객체 생성 불가

        SmartPhone smartPhone = new SmartPhone("홍길동");
        Phone smartPhone3 = new SmartPhone("");

        smartPhone.turnOn();   // Phone의 메소드
        smartPhone.internetSearch();
        smartPhone.turnOff();  // Phone의 메소드

        SmartPhone smartPhone2 = new SmartPhone("owner");

        // 추상클래스(부모) 타입 배열 선언
        Phone[] list = {smartPhone, smartPhone2};
    }
}