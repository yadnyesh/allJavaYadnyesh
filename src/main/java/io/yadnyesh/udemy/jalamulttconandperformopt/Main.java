package io.yadnyesh.udemy.jalamulttconandperformopt;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            log.info("Currently in Thread: " + Thread.currentThread().getName());
            throw new RuntimeException("intentional exception");
        });
        thread.setName("New Worker Thread");
        log.info("Before starting thread: " + Thread.currentThread().getName());
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                log.info("A critical error has happened in thread: " + t.getName());
            }
        });
        thread.start();
        thread.setPriority(Thread.MAX_PRIORITY);
        log.info("After starting thread: " + Thread.currentThread().getName());
        log.info("Thread Priority: " + Thread.currentThread().getPriority());
        Thread.sleep(2000);
    }
}
