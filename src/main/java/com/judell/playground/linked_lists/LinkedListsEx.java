package com.judell.playground.linked_lists;

import java.util.LinkedList;

public class LinkedListsEx {

    /**
     * Linked list or any linked collection maintains the order that each element was added
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("b");
        linkedList.add("a");
        linkedList.add("c");

        System.out.println(linkedList);
    }
}
