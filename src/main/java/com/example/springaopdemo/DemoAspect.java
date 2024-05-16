package com.example.springaopdemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspect {

    @Around("@within(org.springframework.stereotype.Service)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around - before !!");
        Object result = joinPoint.proceed();
        System.out.println("around - after !!");
        return result;
    }

}