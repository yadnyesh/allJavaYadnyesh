package io.yadnyesh.udemy.javamultithreadfromzero.threading;

import lombok.extern.slf4j.Slf4j;

public class SupervisorExampleWithThread {
    public static void main(String[] args) {
        ParallerWorker1 parallerWorker1 = new ParallerWorker1();
        ParallerWorker2 parallerWorker2 = new ParallerWorker2();
        parallerWorker1.start();
        parallerWorker2.start();
    }
}

@Slf4j
class ParallerWorker1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info("Worker 1 executing task : " + i);
        }
    }
}

@Slf4j
class ParallerWorker2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info("Worker 2 executing task : " + i);
        }
    }
}