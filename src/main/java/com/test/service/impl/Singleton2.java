package com.test.service.impl;

public class Singleton2 {
    private Singleton2() {
    }

    public static class Singleton2Instance{
        private static final Singleton2 singleton2 = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return Singleton2Instance.singleton2;
    }
}
