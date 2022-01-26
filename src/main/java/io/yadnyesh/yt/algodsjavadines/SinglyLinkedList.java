package io.yadnyesh.yt.algodsjavadines;

import lombok.extern.slf4j.Slf4j;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

@Slf4j
public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            System.out.println("Const of inner class");
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(3);
        ListNode fifth = new ListNode(4);

        singlyLinkedList.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        singlyLinkedList.printSLL();
        singlyLinkedList.printLengthOfLinkedList();
    }

    public void printSLL() {
        ListNode current = head;
        while (current != null) {
            log.info(current.data + "--> ");
            current = current.next;
        }
        log.info("Done printing LL");
    }

    private void printLengthOfLinkedList() {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("The length of linked list is: " + count);
    }


}
