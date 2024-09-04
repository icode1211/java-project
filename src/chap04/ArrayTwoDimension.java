package chap04;

/**
 * 2차원 배열 예시
 * 1. 2차원 배열 선언문 (선언, 초기화 한번에)
 * 2. 2차원 배열 선언문 (선언따로, 초기화 따로)
 */
public class ArrayTwoDimension {
    public static void main(String[] args) {
        // 1. 2차원 배열 선언문 (선언, 초기화 한번에)
        int[][] array = { {1, 2}, {4, 5, 6}, {7, 8, 9, 10}};    // int[3][4]

        System.out.println("array 배열 길이: " + array.length);
        System.out.println("array[0] 배열 길이: " + array[0].length);
        System.out.println("array[1] 배열 길이: " + array[1].length);
        System.out.println("array[2] 배열 길이: " + array[2].length);

        // 2. 2차원 배열 선언문 (선언 따로, 초기화 따로)
        int[][] twoDimensions = new int[2][3];
        int value = 0;
        twoDimensions[0][0] = ++value;
        twoDimensions[0][1] = ++value;
        twoDimensions[0][2] = ++value;
        twoDimensions[1][0] = ++value;
        twoDimensions[1][1] = ++value;
        twoDimensions[1][2] = ++value;

        System.out.println("twoDimensions 배열 길이: " + twoDimensions.length);
        System.out.println("twoDimensions[0] 배열 길이: " + twoDimensions[0].length);
        System.out.println("twoDimensions[1] 배열 길이: " + twoDimensions[1].length);
    }
}
