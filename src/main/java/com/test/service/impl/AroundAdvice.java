package com.test.service.impl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class AroundAdvice {
    AroundAdvice() {
    }

    @Around("execution(* com.test.service.*.*(..))")
    public Object processTx(ProceedingJoinPoint jp)
            throws java.lang.Throwable
    {
        System.out.println("执行目标方法之前，模拟开始事务 ...");
        // 执行目标方法，并保存目标方法执行后的返回值
        Object rvt = jp.proceed();
        System.out.println("执行目标方法之后，模拟结束事务 ...");
        return rvt;
    }

    public static void main(String[] args) {
        AroundAdvice aroundAdvice = new AroundAdvice();
        System.out.println(1);
    }
}
