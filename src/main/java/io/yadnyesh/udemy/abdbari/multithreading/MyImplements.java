package io.yadnyesh.udemy.abdbari.multithreading;

public class MyImplements implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while(true) {
            System.out.println(i + "   Hello: ");
            i++;
        }
    }

    public static void main(String[] args) {
        MyImplements myImplements = new MyImplements();
        Thread myThread = new Thread(myImplements);
        myThread.start();
        int i = 1;
        while(true) {
            System.out.println(i + "  World!");
            i++;
        }
    }
}
