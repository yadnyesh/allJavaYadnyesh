package io.yadnyesh.udemy.abdbari.multithreading;

public class MultiThreadingExample {

    public static void main(String[] args) {
        MyData data = new MyData();
        MyThread1tf  myThread1tf = new MyThread1tf(data);
        MyThread2tf myThread2tf = new MyThread2tf(data);

        myThread1tf.start();
        myThread2tf.start();

    }
}

class MyData {
    public void display(String str) {
        synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(str.charAt(i));
            }
        }
    }
}

    class MyThread1tf extends Thread {
        MyData d;
        public MyThread1tf(MyData d) {
            this.d = d;
        }
        public void run() {
            d.display("Hello World!");
        }
    }

    class MyThread2tf extends Thread {
        MyData d;
        public MyThread2tf(MyData d) {
            this.d = d;
        }
        public void run() {
            d.display("Welcome All!");
        }
    }
