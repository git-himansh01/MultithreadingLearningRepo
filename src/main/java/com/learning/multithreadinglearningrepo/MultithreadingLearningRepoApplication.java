package com.learning.multithreadinglearningrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultithreadingLearningRepoApplication {

    public static void main(String[] args) throws InterruptedException {SpringApplication.run(MultithreadingLearningRepoApplication.class, args);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We are now in thread "+ Thread.currentThread().getName());
                System.out.println("Current thread priority is "+ Thread.currentThread().getPriority());
            }
        });
        thread1.setName("My-Main-Thread");
        thread1.setPriority(Thread.MAX_PRIORITY);
                System.out.println("We are in thread " + Thread.currentThread().getName()+ " before starting a new thread");
                thread1.start();
                System.out.println("We are in thread " + Thread.currentThread().getName()+ " after starting a new thread");
                Thread.sleep(10000);
}
}