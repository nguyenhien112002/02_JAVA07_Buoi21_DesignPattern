package com.myclass.dao;

public class SmsDao implements MessageDao {
    public void sendMessage() {
        System.out.println("sms send...");
    }
}
