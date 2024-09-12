package chap07.abstact;

/**
 * 추상 클래스 Phone 선언
 */
public abstract class Phone {
    private String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }

    abstract void internetSearch();
}
