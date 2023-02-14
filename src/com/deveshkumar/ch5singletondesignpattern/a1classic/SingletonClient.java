package com.deveshkumar.ch5singletondesignpattern.a1classic;

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
Output 1: All the threads are getting the same object
Getting Singleton object from Thread-5 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@c74839b
Getting Singleton object from Thread-0 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@c74839b
Getting Singleton object from main thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@c74839b
Getting Singleton object from Thread-2 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@c74839b
Getting Singleton object from Thread-4 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@c74839b
Getting Singleton object from Thread-3 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@c74839b
Getting Singleton object from Thread-1 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@c74839b
Getting Singleton object from Thread-6 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@c74839b
Getting Singleton object from Thread-9 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@c74839b
Getting Singleton object from Thread-7 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@c74839b
Getting Singleton object from Thread-8 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@c74839b


Output 2: Notice, thread-1 getting the different object that means, here we have created more than 1 objects
Getting Singleton object from Thread-5 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@73bab1f9
Getting Singleton object from Thread-1 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@31996ae2
Getting Singleton object from Thread-8 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@73bab1f9
Getting Singleton object from Thread-0 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@73bab1f9
Getting Singleton object from Thread-9 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@73bab1f9
Getting Singleton object from Thread-4 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@73bab1f9
Getting Singleton object from Thread-7 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@73bab1f9
Getting Singleton object from Thread-6 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@73bab1f9
Getting Singleton object from Thread-2 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@73bab1f9
Getting Singleton object from main thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@73bab1f9
Getting Singleton object from Thread-3 thread: com.deveshkumar.ch5singletondesignpattern.a1classic.Singleton@73bab1f9
 */