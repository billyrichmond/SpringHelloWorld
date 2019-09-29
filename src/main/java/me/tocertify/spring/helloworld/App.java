package me.tocertify.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("message.xml");
        Message message = (Message) container.getBean("message");
        message.sayHello();
    }

}


