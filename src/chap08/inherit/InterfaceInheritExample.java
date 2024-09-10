package chap08.inherit;

public class InterfaceInheritExample {
    public static void main(String[] args) {
        ImplementsC impleC = new ImplementsC();
        impleC.methodA();
        impleC.methodB();
        impleC.methodC();
        System.out.println("------------------");

        InterfaceA interfaceA = impleC;
        interfaceA.methodA();
        System.out.println("------------------");

        InterfaceB interfaceB = impleC;
        interfaceB.methodB();
        System.out.println("------------------");

        InterfaceC interfaceC = impleC;
        interfaceC.methodA();
        interfaceC.methodB();
        interfaceC.methodC();
    }
}
