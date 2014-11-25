package com.newblue.jdkstudy.chapter13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by levi on 2014/11/18.
 */
public class Chapter13Demo06 {
    public static void main(String [] args){
        List<String> all = new ArrayList<String>();
        addToString(all);
        Iterator<String> iterator = all.iterator();
        while (iterator.hasNext()){
            String a = iterator.next();
            if(a.equals("_")) iterator.remove();
        }
        System.out.println(all);
    }

    private static void addToString(List<String> all) {
        all.add("Hello");
        all.add("_");
        all.add("world");
        all.add("睡觉");
    }
}
