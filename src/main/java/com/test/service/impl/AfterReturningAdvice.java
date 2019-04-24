package com.test.service.impl;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class AfterReturningAdvice {
    @AfterReturning(returning="rvt",
            pointcut="execution(* com.test.service.impl.*.*(..))")
    public Object log(Object rvt)
    {
        System.out.println("获取目标方法返回值 :" + rvt);
        System.out.println("模拟记录日志功能 ...");
        return rvt;
    }
}
