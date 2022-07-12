package io.yadnyesh.yt.apnacollege;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinkedListDemo {
    Node head = null;

    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(String data) {
        Node lastNode = new Node(data);
        if (head == null) {
            head = lastNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = lastNode;
    }

    public void printLinkedList() {
        Node currNode = head;
        if(currNode == null) {
            System.out.println("List is Empty");
        }
        while(currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public void deleteFirst(){
        if (head == null) {
            System.out.println("The list is already empty");
        } else {
            head = head.next;
        }
    }


    public static void main(String[] args) {
        LinkedListDemo linkedList = new LinkedListDemo();
        linkedList.addFirst("One");
        linkedList.addLast("Two");
        linkedList.addLast("Three");
        linkedList.addFirst("Zero");
        linkedList.deleteFirst();
        linkedList.printLinkedList();
    }
}
