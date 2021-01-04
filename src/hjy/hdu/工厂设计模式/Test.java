package hjy.hdu.工厂设计模式;

public class Test {
    public static void main(String[] args) {
        //普通工厂类
        // 1.声明工厂类类型的引用指向工厂类类型的对象
        SendFactory sf = new SendFactory();
        // 2.调用生产方法来实现对象的创建
        Sender sender1 = sf.produce("mail");
        // 3.使用对象调用方法模拟发生的行为
        sender1.send();

        Sender sender2 = sf.produce("sms");
        sender2.send();

        //多个工厂方法

        SendFctories sendFctories = new SendFctories();
        Sender sender3 = sendFctories.produceMail();
        sender3.send();
        Sender sender4 = sendFctories.produceSms();
        sender4.send();

        //静态工厂方法

        Sender sender5 = StaticSendFactory.produceMail();
        sender5.send();
        Sender sender6 = StaticSendFactory.produceSms();
        sender6.send();
    }
}
