package com.div.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Div on 2018-04-17.
 */

@Aspect
@Component
public class Logger {
    @Pointcut("bean(camera)")
    private void pointcutDemo() {}

    //@Before("execution(void com.div.spring.aop.Camera.snap())")
    @Before("pointcutDemo()")
    public void withinDemoAdvice(JoinPoint point) {
        System.out.println("--POINTCUT DEMO--");

        for(Object arg : point.getArgs())
            System.out.println("^ Arg: " + arg.toString() + " ^");
    }
}
