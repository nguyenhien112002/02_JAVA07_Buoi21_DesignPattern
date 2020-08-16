package com.myclass.controller;

import com.myclass.dao.FacebookDao;
import com.myclass.dao.MessageDao;

public class SmsController implements MessageController {
    MessageDao messageDao = null;

    public SmsController(MessageDao messageDao) {
        this.messageDao = messageDao;
    }

    public void send() {
        messageDao.sendMessage();
    }
}
