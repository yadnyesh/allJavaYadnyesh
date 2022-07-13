package io.yadnyesh.yt.apnacollege;

public class QueueWithArray {

    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear+1)%size == front;
        }

        public static void add(int data) {
            if(isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if(front == -1) {
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return 0;
            }
            int result = arr[front];
            if(rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return 0;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.remove();
        queue.add(60);
        queue.remove();
        queue.add(70);
        queue.remove();
        queue.add(80);
        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }

    }
}
