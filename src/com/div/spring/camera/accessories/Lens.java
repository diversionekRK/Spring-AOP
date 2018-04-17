package com.div.spring.camera.accessories;

import org.springframework.stereotype.Component;

/**
 * Created by Div on 2018-04-17.
 */

@Component
public class Lens {

    public void zoom(int factor) {
        System.out.println("Zooming lens: " + factor);
    }
}
