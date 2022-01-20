package com.vijay.annotaion.config;

import org.springframework.stereotype.Component;

@Component
public class Vadafone implements Sim{
    @Override
    public void calling() {
        System.out.println("Calling using Vadafone Sim");
    }

    @Override
    public void surfingData() {
        System.out.println("Surfing data using Vadafone Service");
    }
}
