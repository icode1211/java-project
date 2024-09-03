package chap02;

public class AutoBoxingPerformanceExample {
    public static void main(String[] args) {
        // 성능 측정 (오토박싱 VS 오토박싱X)
        long currentTimeMillis = System.currentTimeMillis();
        Integer sum = 0;
        for (int i = 0; i < 2000000; i++) {
            sum = sum + i;  // 오토박싱
        }
        long term = System.currentTimeMillis() - currentTimeMillis;
        System.out.println("오토박싱 소요시간: " + term);

        long currentTimeMillis2 = System.currentTimeMillis();
        int sum2 = 0;
        for (int i = 0; i < 2000000; i++) {
            sum2 = sum2 + i;    // primitive type 연산
        }
        long term2 = System.currentTimeMillis() - currentTimeMillis2;
        System.out.println("primitive type 연산 소요시간: " + term2);
    }
}
