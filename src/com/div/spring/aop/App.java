package com.div.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Div on 2018-04-17.
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/div/spring/aop/beans.xml");

        Camera camera = (Camera) context.getBean("camera");
        camera.snap();

        context.close();
    }
}
