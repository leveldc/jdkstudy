package com.newblue.jdkstudy.chapter09;

/**
 * Created by levi on 2014/11/17.
 */
class Info<T extends Number>{
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }

    @Override
    public String toString() {
        return this.var.toString();
    }
}
public class Chapter09Demo02 {
    public static void main(String[] args){
        Info<Integer> info = new Info<Integer>();
        info.setVar(123);
        fun(info);
    }

    private static void fun(Info<? extends Number> info) {
        System.out.println(info.toString());
    }
}
