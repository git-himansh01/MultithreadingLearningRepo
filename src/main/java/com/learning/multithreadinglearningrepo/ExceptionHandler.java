package com.learning.multithreadinglearningrepo;

public class ExceptionHandler {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                throw new RuntimeException("Intentional Exception ");
            }
        });
        thread1.setName("Misbehaving thread");
        thread1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("A critical error has happened "+t.getName()+", The error is "+e.getMessage());
            }
        });
        thread1.start();
    }
}
