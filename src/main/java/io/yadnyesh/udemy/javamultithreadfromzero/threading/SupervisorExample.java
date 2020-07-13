package io.yadnyesh.udemy.javamultithreadfromzero.threading;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SupervisorExample {
    public static void main(String[] args) {
        Worker1 worker1 = new Worker1();
        Worker2 worker2 = new Worker2();
        try {
            worker1.executeWork();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        worker2.executeWork();
    }
}

@Slf4j
class Worker1 {
    public void executeWork() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            log.info("Worker 1 executing task : " + i);
        }
    }
}

@Slf4j
class Worker2 {
    public void executeWork() {
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
