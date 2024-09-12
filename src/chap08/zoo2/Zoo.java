package chap08.zoo2;

/**
 * 인터페이스를 사용
 * 사육사가 각 동물마다 다른 먹이를 주는
 * zookeeper.feed() 메소드 호출
 */
public class Zoo {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();

        Lion lion = new Lion();
//        Predator lion = new Lion();
        zookeeper.feed(lion);

        Tiger tiger = new Tiger();
//        Predator tiger = new Tiger();
        zookeeper.feed(tiger);

        // 배열, 인터페이스(다형성)
        Predator[] predator = {lion, tiger};
    }
}
