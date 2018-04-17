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

    @After("cameraSnap()")
    public void afterAdvice() {
        System.out.println("After advice.");
    }

    @AfterReturning("cameraSnap()")
    public void afterReturningAdvice() {
        System.out.println("After returning advice.");
    }

    @AfterThrowing("cameraSnap()")
    public void afterThrowingAdvice() {
        System.out.println("After throwing advice.");
    }

    @Around("cameraSnap()")
    public void aroundAdvice(ProceedingJoinPoint point) {
        System.out.println("Around advice (before).");

        try {
            point.proceed();
        } catch (Throwable throwable) {
            System.out.println("In around advice: " + throwable.getMessage());
        }

        System.out.println("Around advice (after).");
    }
}
