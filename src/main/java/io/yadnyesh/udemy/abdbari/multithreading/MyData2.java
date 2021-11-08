package io.yadnyesh.udemy.abdbari.multithreading;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyData2 {
    int value;
    boolean flag = true;
    synchronized public void set(int v) throws InterruptedException {
        while (flag != true)
            wait();
        value = v;
    }

    synchronized public int get() {
        return value;
    }
}

@Slf4j
class Producer extends Thread {
    MyData2 data;
    public Producer(MyData2 d) {
        data = d;
    }
    public void run() {
        int count = 1;
        while(true) {
            try {
                data.set(count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
            log.info("Producer produced.... " + count);
        }
    }
}

@Slf4j
class Consumer extends Thread {
    MyData2 data;
    public Consumer(MyData2 d) {
        data = d;
    }
    public void run() {
        int value;
        while(true) {
            value = data.get();
            log.info("Consumer consumed... " + value);
        }
    }
}

class InterProcess {

    public static void main(String[] args) {
        MyData2 data = new MyData2();
        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);
        producer.start();
        consumer.start();
    }

}
