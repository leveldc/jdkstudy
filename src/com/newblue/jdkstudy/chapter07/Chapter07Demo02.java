package com.newblue.jdkstudy.chapter07;

/**
 * Created by levi on 2014/11/16.
 */
class Math {
    public  int div(int i,int j) throws Exception {
        int temp = i / j;
        return temp;
    }
}

public class Chapter07Demo02 {
    public static void main(String[] args) {
        Math m = new Math();
        try {
            m.div(3,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
