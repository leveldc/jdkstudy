package com.newblue.jdkstudy.chapter11;

/**
 * Created by levi on 2014/11/17.
 */
public class StringBufferDemo02 {
    public static void main(String[] args){
        StringBuffer buf= new StringBuffer();
        buf.append("Hello");
        buf.insert(0, "睡觉 ");
        buf.insert(buf.length(),"洗澡");

        fun(buf);
        System.out.println(buf);
    }
    public static void fun(StringBuffer s){
        s.append("NND").append("着急");
    }
}
