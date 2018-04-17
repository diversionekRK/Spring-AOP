package com.div.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by Div on 2018-04-17.
 */

@Component
public class Camera {
    public void snap() {
        System.out.println("SNAP!");
    }
}
