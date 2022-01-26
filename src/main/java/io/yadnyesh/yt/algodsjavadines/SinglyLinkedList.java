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
    }

    public void printSLL() {
        ListNode current = head;
        while (current != null) {
            log.info(current.data + "--> ");
            current = current.next;
        }
        log.info("Done printing LL");
    }


}
