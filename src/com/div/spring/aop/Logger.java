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

    @Pointcut("within(com.div.spring..*)")
    private void withinDemo() {}

    @Pointcut("target(com.div.spring.aop.Camera)")
    private void targetDemo() {}

    @Pointcut("this(com.div.spring.aop.Machine)")
    private void thisDemo() {}

    //@Before("execution(void com.div.spring.aop.Camera.snap())")
    @Before("withinDemo()")
    public void withinDemoAdvice() {
        System.out.println("Within demo advice.");
    }

    @Before("targetDemo()")
    public void targetDemoAdvice() {
        System.out.println("Target demo advice.");
    }

    @Before("thisDemo()")
    public void thisDemoAdvice() {
        System.out.println("This demo advice.");
    }
}
