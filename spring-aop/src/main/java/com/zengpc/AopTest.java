package com.zengpc;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopTest {
    @Pointcut(value = "execution(* com.zengpc.*.*(..))")
    private void point(){

    }

    @Pointcut(value = "within(com.zengpc.*)")
    private void point1(){

    }
    @Before("point1()")
    private void log(){
        System.out.println("aaaa");
    }

    @After("point()")
    private void logAfter(){
        System.out.println("bbbb");
    }

    @Around("point()")
    private void logAround(ProceedingJoinPoint pj) throws Throwable {
        Object proceed = pj.proceed();
        System.out.println(proceed);

        System.out.println(pj.getSignature());
        System.out.println(pj.getKind());
        System.out.println(pj.getSourceLocation());
        System.out.println(pj.getTarget());
        System.out.println(pj.getThis());
        System.out.println(pj.getClass());
        System.out.println("ccc");
    }
}
