package io.yadnyesh.udemy.abdbari.multithreading;

public class MyThread extends Thread {
    public void run(){
        int i = 1;
        while(true) {
            System.out.println("Hello: " + i + "   " + Thread.currentThread().getName());
            i++;
        }
    }

}
