package chap11.queue;

/**
 * Queue에 담을 Message 클래스 정의
 */
public class Message {
    private String command;         // sendMail, sendKakaoTalk, sendSms
    private String to;              // 수신인

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

    public String getCommand() {
        return command;
    }

    public String getTo() {
        return to;
    }
}
