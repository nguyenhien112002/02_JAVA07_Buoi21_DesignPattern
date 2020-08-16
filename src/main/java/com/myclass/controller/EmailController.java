package com.myclass.controller;

import com.myclass.dao.EmailDao;
import com.myclass.dao.FacebookDao;
import com.myclass.dao.MessageDao;

public class EmailController implements MessageController{
    private MessageDao messageDao = null;

    public EmailController(MessageDao messageDao) {
        this.messageDao = messageDao;
    }

    public void send() {
        messageDao.sendMessage();
    }
}
