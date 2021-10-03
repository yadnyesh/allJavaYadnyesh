package io.yadnyesh.udemy.abdbari.multithreading;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadTest {
    public static void main(String[] args) throws Exception {
        MyThread2 t = new MyThread2("My Thread");
        //t.start();
        log.info(String.valueOf(t.getId()));
        log.info(t.getName());
        log.info(String.valueOf(t.getState()));
        log.info(String.valueOf(t.getPriority()));
        log.info(String.valueOf(t.getThreadGroup()));



    }
}

class MyThread2 extends Thread {
    public MyThread2(String name) {
        super(name);
    }
}
