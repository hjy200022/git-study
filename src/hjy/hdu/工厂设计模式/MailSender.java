package hjy.hdu.工厂设计模式;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("正在发送邮件...");
    }
}
