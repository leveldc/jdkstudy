package com.newblue.jdkstudy.chapter13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Created by levi on 2014/11/19.
 */
public class Chapter13Demo07 {
    public static void main(String [] args){
        List<String> alList = new ArrayList<String>();
        Collections.addAll(alList,"123","456","789");
        System.out.println(alList);

        Stack stack = new Stack();
        stack.push("aaa");
        stack.push("bbbb");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
