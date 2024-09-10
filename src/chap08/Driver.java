package chap08;

/**
 * 자동 타입 변환된 vehicle 객체를
 * instanceof 연산자 사용해서 실제 생성된 객체 판별
 */
public class Driver {
    void drive(Vehicle vehicle) {
        // instanceof 연산자
        if (vehicle instanceof Bus) {
            System.out.println("Bus//");
        } else if (vehicle instanceof Taxi) {
            System.out.println("Taxi//");
        }

        /*
         * if 조건문 대신 switch-case문으로 작성 가능
         *  Pattern matching for Switch (JDK 17부터 사용 가능)
         */
        switch (vehicle) {
            case Bus bus -> System.out.println("Bus//");
            case Taxi taxi -> System.out.println("Taxi//");
            default -> System.out.print("");
        }

        vehicle.run();
    }
}
