package com.vijay.annotaion.config;

import org.springframework.stereotype.Component;

@Component
public class Jivo implements Sim{
    @Override
    public void calling() {
        System.out.println("Calling using Jivo Sim");
    }

    @Override
    public void surfingData() {
        System.out.println("Surfing data using Jivo service");
    }
}
