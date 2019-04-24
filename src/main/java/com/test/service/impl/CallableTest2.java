package com.test.service.impl;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableTest2 {

    static class SomeCallable implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            int sum = 0;
            for(int i=0; i<100; i++){
                sum ++;
            }
            return sum;
        }
    }

    public static void main(String[] args) throws Exception{
        SomeCallable someCallable = new SomeCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(someCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());
    }
}
