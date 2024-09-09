package chap07;

/**
 * 자식 클래스에서 sleep() 메소드 오버로딩
 */
public class DogExample {
    public static void main(String[] args) {
        Dog dog = new Dog("happy");
        dog.setName("happy");
        dog.sleep();
        dog.sleep(8);
    }
}
