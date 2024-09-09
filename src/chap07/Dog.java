package chap07;

public class Dog extends Animal {

    Dog(String name) {
        // super();
        System.out.println("Dog 객체 생성, name:" + name);
    }

    void sleep(int times) {
        System.out.println(name + " Zzz... " + times + " hours");
    }
}
