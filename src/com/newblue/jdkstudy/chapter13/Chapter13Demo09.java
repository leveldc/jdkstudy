package com.newblue.jdkstudy.chapter13;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by levi on 2014/11/19.
 */
public class Chapter13Demo09 {
    public static void main(String args[]){
        Properties p = new Properties();
        File f = new File("D:"+File.separator+"test.properties");
        try {
            p.load(new FileInputStream(f));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print(p);
    }
}
