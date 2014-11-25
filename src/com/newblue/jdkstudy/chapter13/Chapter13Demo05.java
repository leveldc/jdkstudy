package com.newblue.jdkstudy.chapter13;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by levi on 2014/11/18.
 */
public class Chapter13Demo05 {
    public static void main(String[] args){
        Set<Person> alSet = new HashSet<Person>();
        add(alSet);
        System.out.println(alSet);
    }

    private static void add(Set<Person> alSet) {
        alSet.add(new Person("张三",30));
        alSet.add(new Person("张四",31));
        alSet.add(new Person("张五",32));
        alSet.add(new Person("张五",33));
        alSet.add(new Person("张七",34));
        alSet.add(new Person("王一",29));
    }
}
