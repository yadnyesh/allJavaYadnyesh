package io.yadnyesh.udemy.abdbari.multithreading;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadTest {
    public static void main(String[] args) throws Exception {
        MyThread2 t = new MyThread2("My Thread");
        int count = 1;
        while (true) {
            log.info(count++ + " ThreadTest");
        }
    }
}

@Slf4j
class MyThread2 extends Thread {
    public MyThread2(String name) {
        super(name);
    }
    public void run() {
        int count = 1;
        while (true) {
            log.info(count++ + " My Thread2");
        }
    }
}
