package com.myclass.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.myclass.controller.EmailController;
import com.myclass.controller.FacebookController;
import com.myclass.controller.MessageController;
import com.myclass.controller.SmsController;
import com.myclass.dao.EmailDao;
import com.myclass.dao.FacebookDao;
import com.myclass.dao.MessageDao;
import com.myclass.dao.SmsDao;

@Configuration
public class AppConfig {

    @Bean
    public MessageDao facebookDao() {
        return new FacebookDao();
    }

    @Bean
    public MessageDao emailDao() {
        return new EmailDao();
    }

    @Bean
    public MessageDao smsDao() {
        return new SmsDao();
    }

    @Bean
    public MessageController emailController() {
        MessageDao messageDao = facebookDao();
        return new EmailController(messageDao);
    }

    @Bean
    public MessageController facebookController() {
        MessageDao messageDao = facebookDao();
        return new FacebookController(messageDao);
    }

    @Bean
    public MessageController smsController() {
        MessageDao messageDao = smsDao();
        return new SmsController(messageDao);
    }
}
