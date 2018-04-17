package com.div.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by Div on 2018-04-17.
 */

@Component
@Deprecated
public class Car {

    @Deprecated
    public void start() {
        System.out.println("Starting a car.");
    }
}
