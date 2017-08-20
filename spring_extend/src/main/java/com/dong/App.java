package com.dong;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext  context =
                new ClassPathXmlApplicationContext("classpath:spring-postProcessor.xml");
        context.start();
        //AwareBean awareBean = (AwareBean)context.getBean("awareBean");
        context.close();
    }
}
