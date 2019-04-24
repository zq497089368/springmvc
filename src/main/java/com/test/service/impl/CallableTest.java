package com.test.service.impl;


import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class CallableTest{

    static class CallableDemo implements Callable<Integer>{

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
        double a = 100 * 100 * 0.01 - 100 * 50 * 0.02;





        int aa = 100  +  200  +  300  +  500  +  800  +  1300  +  2100  + 3400  +  5500;



        FutureTask<Integer> futureTask = new FutureTask<>(new CallableDemo());
        Executor executor = Executors.newSingleThreadExecutor();
        System.out.println(futureTask.get());
        executor.execute(futureTask);
        System.out.println(futureTask.get());
    }

}
