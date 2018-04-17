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

//    @Pointcut("within(@java.lang.Deprecated com.div.spring..*)")
//    private void pointcutDemo() {}

//    @Pointcut("@target(Deprecated)")
//    private void pointcutDemo() {}

//    @Pointcut("@annotation(Deprecated)")
//    private void pointcutDemo() {}

    @Pointcut("@args(Deprecated)")
    private void pointcutDemo() {}

    //@Before("execution(void com.div.spring.aop.Camera.snap())")
    @Before("pointcutDemo()")
    public void withinDemoAdvice() {
        System.out.println("--POINTCUT DEMO--");
    }
}
