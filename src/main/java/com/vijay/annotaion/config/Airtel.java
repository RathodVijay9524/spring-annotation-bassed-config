package com.vijay.annotaion.config;

import org.springframework.stereotype.Component;



@Component
public class Airtel implements Sim{


    @Override
    public void calling() {
        System.out.println("Calling using Airtel Sim");
    }

    @Override
    public void surfingData() {
        System.out.println("surfing data using Airtel Service");
    }
}
