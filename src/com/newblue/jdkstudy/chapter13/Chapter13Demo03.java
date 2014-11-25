package com.newblue.jdkstudy.chapter13;

        import java.util.HashSet;
        import java.util.Set;

/**
 * Created by levi on 2014/11/18.
 */
public class Chapter13Demo03  {
    public static void main(String[] args){
        Set<String> alSet = new HashSet<String>();
        alSet.add("Hello");
        alSet.add("this");
        alSet.add("is");
        alSet.add("a");
        alSet.add("set");
        alSet.add("test");
        alSet.add("test");
        System.out.println(alSet);
    }
}
