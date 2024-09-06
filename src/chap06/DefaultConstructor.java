package chap06;

/**
 * 디폴트 생성자 확인해보기
 * -> 만약 클래스에 생성자가 하나도 없다면, 컴파일러는 자동으로 디폴트 생성자를 추가
 * -> 사용자가 작성한 생성자가 하나라도 구현되어 있다면 컴파일러는 디폴트 생성자를 추가하지 않음
 */
public class DefaultConstructor {
    String field;

    DefaultConstructor() {
//        this.field = "특정값으로 초기화";
    }

    DefaultConstructor(String field) {
        this.field = field;
    }

    public static void main(String[] args) {
        // 입력값 없는 생성자
        DefaultConstructor constructorTest1 = new DefaultConstructor();

        // 입력값이 있는 생성자
        DefaultConstructor constructorTest2 = new DefaultConstructor("특정값");

    }
}
