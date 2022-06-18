package io.yadnyesh.yt.algodsjavadines;

public class MainSinglyLinkedList {
    public static void main(String[] args) {
        YadSinglyLinkedList<String> linkedList = new YadSinglyLinkedList<>();
        linkedList.addFirst("yadnyesh");
        linkedList.addFirst("rach");
        linkedList.addFirst("shef");
        linkedList.addFirst("ghu");
        linkedList.addFirst("smtk");
        linkedList.addFirst("last");
        while(!linkedList.isEmpty()) {
            linkedList.removeFirst();
        }

    }
}
