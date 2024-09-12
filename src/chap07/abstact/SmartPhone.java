package chap07.abstact;

/**
 * 추상 클래스 Phone 상속받은 자식 클래스 SmartPhone
 */
public class SmartPhone extends Phone {
    // 생성자
    public SmartPhone(String owner) {
        super(owner);
    }

    // 메소드 -> 만약 internetSearch 메소드가 없다면 컴파일 오류 발생
    @Override
    public void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
