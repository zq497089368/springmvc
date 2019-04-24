package com.test.service.impl;

public class FinalTest {
    public final double i = Math.random();
    public static double j = Math.random();

    public static void main(String[] args) {
        FinalTest f1 = new FinalTest();
        f1 = new FinalTest();
        FinalTest f2 = new FinalTest();
        System.out.println(f1.i);
        System.out.println(f1.j);
        System.out.println(f2.i);
        System.out.println(f2.j);
    }
}
