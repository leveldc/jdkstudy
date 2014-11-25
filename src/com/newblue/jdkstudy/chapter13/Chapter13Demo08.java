package com.newblue.jdkstudy.chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by levi on 2014/11/19.
 */
public class Chapter13Demo08 {
    public static void main(String args[]){
        Properties p = new Properties();
        p.setProperty("NJ","NANJING");
        p.setProperty("BJ","BEIJING");
        p.setProperty("XA","XIAN");
        File f = new File("D:"+File.separator+"test.properties");
        try {
            p.store(new FileOutputStream(f),"area info");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(p.get("NJ"));
        System.out.println(p.getProperty("123","no file"));
    }
}
