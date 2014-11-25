package com.newblue.jdkstudy.chapter15;

/**
 * Created by levi on 2014/11/19.
 */
class X{
    public void run(){
        System.out.println("run");
    }
}
public class Chapter15Demo01 {
    public static void main(String args[]){
        Class<?> c1 = null;
        Class<?> c2 = null;
        Class<?> c3 = null;
        try {
            c1 = Class.forName("com.newblue.jdkstudy.chapter15.X");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        c2 = new X().getClass();

        c3 = X.class;
        System.out.println("c1"+c1.getName());
        System.out.println("c2"+c2.getName());
        System.out.println("c3"+c3.getName());
    }
}
