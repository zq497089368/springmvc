package com.test.service.impl;

public class Singleton1 {
    private static volatile Singleton1 singleton1;

    private Singleton1() {
    }

    public static Singleton1 getInstance(){
        if(singleton1 == null){
            synchronized (Singleton1.class){
                if(singleton1 == null){
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }
}
