package com.hjy.edu.hdu.工厂设计模式;
/**
 * 提供多个工厂方法，分别创建对象
 * @author hjy
 */

public class SendFctories {
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
