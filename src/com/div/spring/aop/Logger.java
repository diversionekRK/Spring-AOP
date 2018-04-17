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

    @Pointcut("args(exposure, ..)")
    private void pointcutDemo(int exposure) {}

    @Pointcut("@annotation(Deprecated)")
    private void pointcutDeprecated() {}

    @Before("pointcutDemo(exposure) && pointcutDeprecated()")
    public void withinDemoAdvice(JoinPoint point, int exposure) {
        System.out.println("--POINTCUT DEMO--");

        System.out.printf("Exposure %d \n", exposure);
    }

    @After("!@annotation(Deprecated)")
    public void afterAdvice() {
        System.out.println("-- AFTER ADVICE --");
    }
}
