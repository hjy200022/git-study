package hjy.hdu.工厂设计模式;
/**
 * 普通工厂模式：建立一个工厂类，对实现了统一接口的一些类进行实例的创建
 * @author hjy
 */
public class SendFactory {
    public Sender produce(String type){
        if ("mail".equals(type)){
            return new MailSender();
        }else if ("sms".equals(type)){
            return new SmsSender();
        }else{
            System.out.println("请输入正确的类型！");
            return null;
        }
    }
}
