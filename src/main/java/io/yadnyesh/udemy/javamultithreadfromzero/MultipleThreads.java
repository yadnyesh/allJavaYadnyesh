package io.yadnyesh.udemy.javamultithreadfromzero;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MultipleThreads {
    public static void main(String[] args) {
        Thread thread1 = new Thread("Thread 1");
        Thread thread2 = new Thread("Thread 2");

        thread1.start();
        thread2.start();

        log.info(thread1.getName());
        log.info(thread2.getName());

    }
}
