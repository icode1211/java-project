package chap06;

/**
 * 6.3 클래스 구성요소 (필드, 생성자, 메서드)
 */
public class Car {      // convention : 첫글자 대문자, 카멜케이스
    String company;     // 멤버변수, 필드
    String model;
    int maxSpeed;

    Car() {             // 입력받는 값이(매개변수) 없는 생성자
        company = "현대자동차";
    }

    /* 오버로딩 : 이름이 같은 메서드(생성자)에 다양한 매개변수를 정의 */
    Car(String company) {
        this.company = company;
    }

    Car(String company, String model) {
        this.company = company;
        this.model = model;
    }

    Car(String company, String model, int maxSpeed) {
        this.company = company;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void setModel(String model) {
        this.model = model;
    }

    // maxSpeed 값을 넣어주는 메소드
    void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    String printField() {
        return "company: " + company + ", model:" + model + ", maxSpeed: " + maxSpeed;
    }

    public static void main(String[] args) {
        Car car = new Car();  // Car 클래스 객체 생성
        car.setMaxSpeed(200);
        System.out.println(car.printField());

        Car car2 = new Car("기아자동차");
        car2.setMaxSpeed(250);
        String printResult = car2.printField();
        System.out.println(printResult);

        Car car3 = new Car("현대자동차", "sonata", 300);
        System.out.println(car3.printField());

        Car car4 = new Car("페라리", "ferrari", 400);
        System.out.println(car4.printField());
    }
}
