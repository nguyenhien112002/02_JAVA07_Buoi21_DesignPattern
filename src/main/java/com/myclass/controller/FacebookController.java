package com.myclass.controller;

import com.myclass.dao.FacebookDao;
import com.myclass.dao.MessageDao;

public class FacebookController implements MessageController {
    MessageDao messageDao = null;

    public FacebookController(MessageDao messageDao) {
        this.messageDao = messageDao;
    }

    public void send() {
        messageDao.sendMessage();
    }

}
