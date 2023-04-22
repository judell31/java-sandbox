package com.judell.playground.list;

import java.util.ArrayList;
import java.util.Random;

//Todo: Refactor and add javadoc
public class List {

    public static void main(String[] args) {
        java.util.List<String> list = new ArrayList<>();
        String[] test = {"test", "me", "and", "you", "the", "tree"};

        System.out.println("List size before add: " + list.size());
        list.add("test");
        list.add("me");
        list.add("tree");
        list.add("crate");
        list.add("breath");
        System.out.println("List size after add: " + list.size());
        Random random = new Random(System.currentTimeMillis());
        int index = random.nextInt(test.length);
        System.out.println(index);
        System.out.println(test[index]);

    }
}
