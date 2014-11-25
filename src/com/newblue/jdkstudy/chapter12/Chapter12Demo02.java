package com.newblue.jdkstudy.chapter12;

import java.io.*;

/**
 * Created by levi on 2014/11/21.
 */
public class Chapter12Demo02 {
    public static void main(String args[]){
        File file = new File("D:"+File.separator+"test.txt");
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        try {
            outputStream.write("NIHAO,喜欢ifan".getBytes());
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
