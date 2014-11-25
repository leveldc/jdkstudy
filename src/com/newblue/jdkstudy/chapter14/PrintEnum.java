package com.newblue.jdkstudy.chapter14;

/**
 * Created by levi on 2014/11/19.
 */
public class PrintEnum {
    public static void main(String args[]){
        for(ColorA c:ColorA.values()){
            print(c);
        }

    }

    public static void print(ColorA color){
        switch(color){
            case BLUE:{
                System.out.println("蓝颜色");
                break;
            }
        }
    }
}
