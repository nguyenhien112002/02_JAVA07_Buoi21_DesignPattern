package com.myclass.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myclass.config.AppConfig;
import com.myclass.controller.EmailController;
import com.myclass.controller.FacebookController;
import com.myclass.controller.MessageController;
import com.myclass.controller.SmsController;

public class Main {

    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        MessageController facebookController = (FacebookController)context.getBean("facebookController");
        MessageController emailController = (EmailController)context.getBean("emailController");
        MessageController smsController = (SmsController)context.getBean("smsController");

        facebookController.send();
        emailController.send();
        smsController.send();

    }
}
