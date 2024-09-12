package chap09;

/**
 * AutoCloseable 구현 클래스 선언
 */
public class FileStream implements AutoCloseable {
    private String fileName;

    FileStream(String fileName) {
        this.fileName = fileName;
        System.out.println(1);
    }

    void read() throws Exception {
        System.out.println("FileStream.read() 호출 실패");
        System.out.println(3);
        throw new Exception("예외 발생 상황 가정");
    }

    @Override
    public void close() throws Exception {
        System.out.println("close()메소드 호출!!");
        System.out.println(2);
    }
}
