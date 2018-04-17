package com.div.spring.aop;

import org.springframework.stereotype.Component;

/**
 * Created by Div on 2018-04-17.
 */

@Component("camera")
public class Camera implements Machine, Electrical {

    public void snap() throws Exception {
        System.out.println("SNAP!");
        //throw new Exception("Exception...");
    }

    public void snap(int exposure) {
        System.out.println("SNAP! Exposure: " + exposure);
    }

    public String snap(String name) {
        System.out.println("SNAP! Name: " + name);

        return name;
    }

    public void snap(Car car) {
        System.out.println("SNAP! Car.");
    }

    public void snapNighttime() {
        System.out.println("SNAP! Night mode");
    }
}
