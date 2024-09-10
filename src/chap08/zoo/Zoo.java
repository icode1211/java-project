package chap08.zoo;

/**
 * 인터페이스를 사용하지 않고 작성한 Zoo
 * 사육사가 각 동물마다 다른 먹이를 주는
 * zookeeper.feed() 메소드 호출
 */
public class Zoo {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();

        Lion lion = new Lion();
        zookeeper.feed(lion);

        Tiger tiger = new Tiger();
        zookeeper.feed(tiger);
    }
}
