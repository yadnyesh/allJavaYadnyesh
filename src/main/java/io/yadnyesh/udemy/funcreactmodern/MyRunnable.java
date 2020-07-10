package io.yadnyesh.udemy.funcreactmodern;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread Executed .... " + Thread.currentThread().getName());
    }
}
