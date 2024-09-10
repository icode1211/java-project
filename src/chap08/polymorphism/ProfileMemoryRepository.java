package chap08.polymorphism;

/**
 * ProfileRepository 인터페이스의 구현체
 */
public class ProfileMemoryRepository implements ProfileRepository {
    @Override
    public void save() {
        System.out.println("Profile을 메모리에 저장");
    }
}
