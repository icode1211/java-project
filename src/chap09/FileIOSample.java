package chap09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * divide 연산 & 파일 내용 읽어오는 코드
 * 예외 발생 가능성
 * - ArithmeticException
 * - FileNotFoundException
 * - IOException
 */
public class FileIOSample {
    public static void main(String[] args) {
        int b = Integer.parseInt(args[0]);
        int result = 5 / b;    // ArithmeticException 발생 가능
        System.out.println(result);

        String file = System.getProperty("user.dir");
        String filename = file + "/file1.txt";
        // try-with-resource (자동 리소스 닫기)
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println(reader.readLine());
        } catch (FileNotFoundException | ArithmeticException e) {
            System.out.println("Exception 발생");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException 발생");
            System.out.println(e.getMessage());
        }
    }
}
