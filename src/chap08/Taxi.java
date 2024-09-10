package chap08;

public class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("Taxi가 달려갑니다");
    }
}
