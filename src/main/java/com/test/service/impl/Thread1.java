package com.test.service.impl;

public class Thread1 implements Runnable{
    private String name;

    public Thread1(String name) {
        synchronized (this){
            this.name = name;
        }
    }

    @Override
    public void run() {
        for(int i = 0; i<1000; i++){
//            if(i==1){
//                new Thread(this).yield();
//            }



            System.out.println(name + i);
        }
    }

    public static void main(String[] args) throws Exception{
        Thread a = new Thread(new Thread1("A"));
        Thread b = new Thread(new Thread1("B"));
        a.start();
        b.start();
        a.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(Thread.MIN_PRIORITY);
        System.out.println("aa");
    }
}
