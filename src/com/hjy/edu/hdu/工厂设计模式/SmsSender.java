package com.hjy.edu.hdu.工厂设计模式;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("正在发送短信...");
    }
}
