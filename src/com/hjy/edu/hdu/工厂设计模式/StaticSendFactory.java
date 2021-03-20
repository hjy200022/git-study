package com.hjy.edu.hdu.工厂设计模式;

public class StaticSendFactory {
    public static Sender produceMail(){
        return new MailSender();
    }
    public static Sender produceSms(){
        return new SmsSender();
    }
}
