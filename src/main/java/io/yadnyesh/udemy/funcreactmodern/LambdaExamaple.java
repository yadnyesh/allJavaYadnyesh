package io.yadnyesh.udemy.funcreactmodern;

public class LambdaExamaple {
    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        //Using Anonymous inner class
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class Thread executed.  " + Thread.currentThread().getName());
            }
        });
        t2.start();

    }
}
