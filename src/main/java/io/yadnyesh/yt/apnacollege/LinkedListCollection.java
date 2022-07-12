package io.yadnyesh.yt.apnacollege;

import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("This");
        linkedList.addLast("is");
        linkedList.addLast("a");
        linkedList.addLast("list");
        System.out.println(linkedList);
        for(int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + "-->" );
        }
        System.out.println("NULL");
    }
}
