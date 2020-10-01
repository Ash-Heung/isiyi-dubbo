package com.isiyi.mall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("provider.xml");
        applicationContext.start();


        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
