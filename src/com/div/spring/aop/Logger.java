package com.div.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Div on 2018-04-17.
 */

@Aspect
@Component
public class Logger {

    @Pointcut("execution(* com.div.spring.aop.Camera.snap())")
    private void cameraSnap() {}

    //@Before("execution(void com.div.spring.aop.Camera.snap())")
    @Before("cameraSnap()")
    public void beforeAdvice() {
        System.out.println("Before advice.");
    }
}
