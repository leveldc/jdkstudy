package com.newblue.jdkstudy.chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by levi on 2014/11/20.
 */

public class Chapter12Demo01 {
    public static void main(String [] args){
        File file = new File("D:"+File.separator+"test.txt");
        try {
            RandomAccessFile rFile = new RandomAccessFile(file,"rw");

            try {
                rFile.skipBytes(12);
                byte[] b = new byte[8];
                rFile.read(b);
                String a = new String(b);
                System.out.println(a);
                rFile.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
