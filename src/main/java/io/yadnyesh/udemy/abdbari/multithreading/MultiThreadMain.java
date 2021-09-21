package io.yadnyesh.udemy.abdbari.multithreading;

public class MultiThreadMain {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        int i = 1;
        while(true) {
            System.out.println("World: " + i + "   " + Thread.currentThread().getName());
            i++;
        }
    }
}
