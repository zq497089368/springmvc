package com.test.service.impl;

import com.test.service.AopService;
import org.springframework.stereotype.Service;

@Service
public class AopServiceImpl implements AopService {
    @Override
    public String sayHello(String name) {
        System.out.println("-- 正在执行 sayHello 方法 --");
        // 返回简单的字符串
        return name + " Hello , Spring AOP";
    }

    @Override
    public void eat(String food) {
        System.out.println("我正在吃 :"+ food);
    }
}
