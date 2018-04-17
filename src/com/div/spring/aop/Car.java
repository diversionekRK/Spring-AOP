package com.div.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by Div on 2018-04-17.
 */

@Component
public class Car {

    public void start() {
        System.out.println("Starting a car.");
    }
}
