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
//    @Pointcut("args(exposure, aperture)")
//    private void pointcutDemo(int exposure, double aperture) {}
//
//    //@Before("execution(void com.div.spring.aop.Camera.snap())")
//    @Before("pointcutDemo(exposure, aperture)")
//    public void withinDemoAdvice(JoinPoint point, int exposure, double aperture) {
//        System.out.println("--POINTCUT DEMO--");
//
//        System.out.printf("Exposure %d, aperture %.2f \n", exposure, aperture);
//    }

    @Pointcut("args(exposure, ..)")
    private void pointcutDemo(int exposure) {}

    @Before("pointcutDemo(exposure)")
    public void withinDemoAdvice(JoinPoint point, int exposure) {
        System.out.println("--POINTCUT DEMO--");

        System.out.printf("Exposure %d \n", exposure);
    }
}
