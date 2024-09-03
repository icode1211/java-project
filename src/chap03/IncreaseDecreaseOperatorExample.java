package chap03;

/**
 * 단항 연산자 - 증감(전/후위)연산자
 */
public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("----------------------");
        x++;
        ++x;
        System.out.println("x=" + x);   // x=12

        System.out.println("----------------------");
        y--;       // 10
        --y;        // 8
        System.out.println("y=" + y);  // y=8

        System.out.println("----------------------");
        z = x++;     // z = 12
        System.out.println("z=" + z);   // z=12
        System.out.println("x=" + x);   // x=13

        System.out.println("----------------------");
        z = ++x;     // z=14, x=14
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("----------------------");
        z = ++x + y++;   // 15 + 8
        System.out.println("z=" + z);   // z=23
        System.out.println("x=" + x);   // x=15
        System.out.println("y=" + y);   // y=9
    }
}
