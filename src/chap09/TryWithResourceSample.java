package chap09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Try with resource
 */
public class TryWithResourceSample {
    public static void main(String[] args) {
        String filename = "file1.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            reader.readLine();
//            reader.close();   // 자동 호출되는 코드
        } catch (IOException e) {
            System.out.println("IOException 발생");
        }
    }
}
