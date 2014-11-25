package com.newblue.jdkstudy.chapter13;

import java.util.LinkedList;

/**
 * Created by levi on 2014/11/18.
 */
public class chapter13Demo02 {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("你好");
        linkedList.add("吃饭");
        linkedList.add("睡觉");
        linkedList.addFirst("addfirst");
        linkedList.addLast("addlast");
        System.out.println(linkedList);
        methodLinkedList(linkedList);
    }

    private static void methodLinkedList(LinkedList<String> linkedList) {
        System.out.print(linkedList.element());
        System.out.println(linkedList);
        System.out.print(linkedList.peek());
        System.out.println(linkedList);
        System.out.print(linkedList.poll());
        System.out.println(linkedList);
        System.out.print(linkedList.pop());
        System.out.println(linkedList);
    }


}
