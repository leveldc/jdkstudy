package com.newblue.jdkstudy.chapter07;

class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
}

public class Chapter07Demo03 {
    public static void main(String[] args) {
        try {
            throw new MyException("my exception");
        } catch (MyException e) {
            e.printStackTrace();
        }

    }
}
