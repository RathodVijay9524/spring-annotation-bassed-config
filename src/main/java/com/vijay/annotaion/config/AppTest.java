package com.vijay.annotaion.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Sim sim=(Sim) context.getBean("airtel");
        sim.calling();
        sim.surfingData();

    }
}
