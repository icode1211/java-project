package chap08.polymorphism;

/**
 * ProfileRepository 인터페이스의 구현체
 */
public class ProfileDBRepository implements ProfileRepository {
    @Override
    public void save() {
        System.out.println("Profile을 DB에 저장");
    }
}
