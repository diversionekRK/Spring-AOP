package com.div.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by Div on 2018-04-17.
 */

@Aspect
@Component
public class AnimalAspect {

    @DeclareParents(value = "com.div.spring.aop.*", defaultImpl = Animal.class)
    private AnimalInterface animalInterface;

    @Around("within(com.div.spring.aop.*)")
    public void eat(ProceedingJoinPoint point) {
        System.out.println("Animal starts eating...");

        try {
            point.proceed();
        } catch (Throwable throwable) {
            System.out.println("Error occured: " + throwable.getMessage());
        }

        System.out.println("Animal finishes eating.");
    }
}
