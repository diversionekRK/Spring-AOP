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

//    @Pointcut("bean(*a*r*)")
//    private void pointcutDemo() {}

//    @Pointcut("args(int)")
//    private void pointcutDemo() {}

//    @Pointcut("args(double)")
//    private void pointcutDemo() {}

//    @Pointcut("args(Double)")
//    private void pointcutDemo() {}

//    @Pointcut("args(..)")
//    private void pointcutDemo() {}

//    @Pointcut("args(*)")
//    private void pointcutDemo() {}

//    @Pointcut("args(int, *)")
//    private void pointcutDemo() {}

//    @Pointcut("args(.., double)")
//    private void pointcutDemo() {}

//    @Pointcut("args(.., Double)")
//    private void pointcutDemo() {}

    @Pointcut("args(*, Double)")
    private void pointcutDemo() {}

    //@Before("execution(void com.div.spring.aop.Camera.snap())")
    @Before("pointcutDemo()")
    public void withinDemoAdvice() {
        System.out.println("--POINTCUT DEMO--");
    }
}
