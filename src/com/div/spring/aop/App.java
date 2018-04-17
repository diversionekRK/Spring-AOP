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

        try {
            camera.snap();
        } catch (Exception e) {
            //e.printStackTrace();
        }
        camera.snap(500);
        camera.snap("The Eiffel Tower");
        camera.snap(new Car());
        camera.snap(9.99);
        camera.snap(1, 5.55);

        Car car = (Car) context.getBean("car");
        car.start();

        Lens lens = (Lens) context.getBean("lens");
        lens.zoom(11);

        context.close();
    }
}
