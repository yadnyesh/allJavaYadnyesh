package io.yadnyesh.udemy.jalamulttconandperformopt;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                log.info("Currently in Thread: " + Thread.currentThread().getName());
            }
        });
        log.info("Before starting thread: " + Thread.currentThread().getName());
        thread.start();
        log.info("After starting thread: " + Thread.currentThread().getName());
        Thread.sleep(2000);
    }
}
