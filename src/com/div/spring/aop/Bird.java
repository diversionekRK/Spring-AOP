package com.div.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by Div on 2018-04-17.
 */

@Component
public class Bird {
    public void fly() {
        System.out.println("Bird is flying...");
    }
}
