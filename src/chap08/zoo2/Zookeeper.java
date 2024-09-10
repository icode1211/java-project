package chap08.zoo2;

/**
 * Predator 인터페이스를 매개변수로 받는 feed() 메소드
 */
public class Zookeeper {
    void feed(Predator predator) {
//        System.out.println("feed meat");
        System.out.println("feed " + predator.getFood()); // 다형성
    }
}
