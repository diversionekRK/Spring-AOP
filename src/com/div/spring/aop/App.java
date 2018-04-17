package com.div.spring.aop;

import com.div.spring.camera.accessories.Lens;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Div on 2018-04-17.
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/div/spring/aop/beans.xml");

        Camera camera = (Camera) context.getBean("camera");
        Lens lens = (Lens) context.getBean("lens");

        camera.snap();
        camera.snap(2);
        camera.snap("Something interesting");
        camera.snapNighttime();

        lens.zoom(5);

        context.close();
    }
}
