package chap09;

public class TryWithResourceSample2 {
    public static void main(String[] args) {
        try (FileStream stream = new FileStream("file1.txt")) {
            stream.read();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(4);
        } finally {
            System.out.println("완료");
            System.out.println(5);
        }
    }
}
