package chap06;

/**
 * 6.4 final필드, 상수 선언
 * -> Earth에 선언한 static final 필드 호출해보기
 */
public class EarthExample {
    public static void main(String[] args) {
        // Earth에 정의된 상수 출력
        System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + "km");
        System.out.println("지구의 표면적: " + Earth.EARTH_SURFACE_AREA + "km^2");
    }
}
