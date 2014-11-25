package com.newblue.jdkstudy.chapter16;

import java.lang.reflect.Method;

/**
 * Created by levi on 2014/11/19.
 */
@MyAnnoation(key = "333",value = "111")
class Demo{

}

public class Chapter16Demo01 {
    public static void main(String args[]){
        Class c = null;
        Method mt = null;
        try {
            c=Class.forName("com.newblue.jdkstudy.chapter16.Demo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            mt = c.getMethod("toString");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        if(mt.isAnnotationPresent(MyAnnoation.class)){
            MyAnnoation myAnnoation = null;
            myAnnoation  = mt.getAnnotation(MyAnnoation.class);
            System.out.println(myAnnoation.key());
            System.out.println(myAnnoation.value());
        }
    }
}
