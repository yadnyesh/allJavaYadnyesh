package io.yadnyesh.udemy.jalamulttconandperformopt;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main2 extends Thread{

    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
    }

    @Override
    public void run() {
        log.info("Currently in Thread: " + Thread.currentThread().getName());
    }
}
