package com.newblue.jdkstudy.chapter07;

/**
 * Created by levi on 2014/11/16.
 */

public class Chapter07Demo01 {
    public static void main(String[] args) {
        exceptionOne();

    }

    private static void exceptionOne() {
        int beichushu = 10;
        int chushu = 0;
        try {
            int result = beichushu / chushu;
        }finally {
            System.out.print("=========");
        }
        assert beichushu == 10 : "长度改变";
    }

}
