package com.div.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Div on 2018-04-17.
 */

@Aspect
@Component
public class Logger {

    @Pointcut("execution(void com.div.spring.aop.Camera.snap())")
    private void cameraSnap() {}

    //@Before("execution(void com.div.spring.aop.Camera.snap())")
    @Before("cameraSnap()")
    public void aboutToTakePhoto() {
        System.out.println("About to take a photo.");
    }
}
