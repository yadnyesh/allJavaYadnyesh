package io.yadnyesh.yt.apnacollege;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinkedListDemo {
    Node head = null;
    private int size = 0;

    class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            size++;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
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
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
        System.out.println("Size of linked list is: " + this.size);
    }

    public void deleteFirst(){
        if (head == null) {
            System.out.println("The list is already empty");
        } else {
            head = head.next;
            size--;
        }
    }

    public void deleteLast() {
        Node secondLastNode = head;
        Node lastNode = head.next;

        if (head == null) {
            System.out.println("The list is already empty");
            return;
        }
        if (head.next == null) {
            head = null;
            System.out.println("Deleted the only existing node, now the list is empty");
            return;
        }
        while (lastNode.next != null) {
            secondLastNode = lastNode;
            lastNode = lastNode.next;
        }
        secondLastNode.next = null;
        size--;
    }

    public void reverseIterate() {
        if(head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if(head.next == null) {
            System.out.println("Single element linked list");
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        Node nextNode = null;

        while(currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;

    }

    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public void removeNthNodeFromEnd(int n) {
       if(head == null) {
           System.out.println("Empty linked list");
           return;
       }

       if(head.next == null) {
            return;
       }

       int indexToSearch = size - n;
       Node prevNode = head;
       int i = 1;
       while (i < indexToSearch) {
           prevNode = prevNode.next;
           i++;
       }
       prevNode.next = prevNode.next.next;
    }

    public static void main(String[] args) {
        LinkedListDemo linkedList = new LinkedListDemo();
        linkedList.addFirst("One");
        linkedList.addLast("Two");
        linkedList.addLast("Three");
        linkedList.addLast("Four");
        linkedList.printLinkedList();
        linkedList.head = linkedList.reverseRecursive(linkedList.head);
        linkedList.printLinkedList();
        linkedList.removeNthNodeFromEnd(2);
        linkedList.printLinkedList();
    }
}
