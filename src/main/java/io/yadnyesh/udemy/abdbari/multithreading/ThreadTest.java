package io.yadnyesh.udemy.abdbari.multithreading;

public class ThreadTest {
    public static void main(String[] args) throws Exception {
        MyThread2 t = new MyThread2("My Thread");
    }
}

class MyThread2 extends Thread {
    public MyThread2(String name) {
        super(name);
    }
}
