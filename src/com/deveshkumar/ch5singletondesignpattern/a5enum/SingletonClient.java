package com.deveshkumar.ch5singletondesignpattern.a5enum;

/**
 * @author : Devesh Kumar
 * @project : HeadFirstDesignPatterns
 * @date : 14-02-2023
 * @time : 03:27 pm
 */
public class SingletonClient {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++)  {
            // creating new threads and each thread will try to get Singleton Object
            MyThread myThread = new MyThread();
            myThread.start();
        }

        // this will try to get Singleton Object from main thread
        getSingleInstance();
    }

    public static void getSingleInstance() {
        System.out.println("Getting Singleton object from "
                + Thread.currentThread().getName() + " thread: " +  Singleton.getInstance());
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        SingletonClient.getSingleInstance();
    }
}
/*
Output: All the threads are getting the same object
Getting Singleton object from Thread-4 thread: UNIQUE_INSTANCE
Getting Singleton object from Thread-1 thread: UNIQUE_INSTANCE
Getting Singleton object from main thread: UNIQUE_INSTANCE
Getting Singleton object from Thread-2 thread: UNIQUE_INSTANCE
Getting Singleton object from Thread-5 thread: UNIQUE_INSTANCE
Getting Singleton object from Thread-3 thread: UNIQUE_INSTANCE
Getting Singleton object from Thread-0 thread: UNIQUE_INSTANCE
Getting Singleton object from Thread-6 thread: UNIQUE_INSTANCE
Getting Singleton object from Thread-7 thread: UNIQUE_INSTANCE
Getting Singleton object from Thread-9 thread: UNIQUE_INSTANCE
Getting Singleton object from Thread-8 thread: UNIQUE_INSTANCE
*/