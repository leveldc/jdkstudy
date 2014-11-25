package com.newblue.jdkstudy.chapter13;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by levi on 2014/11/18.
 */
public class Chapter13Demo01 {
    public static void main(String[] args) {
        List<String> alList = null;
        alList = new ArrayList<String>();
        alList.add("你好！");
        alList.add(0,"李维");
        List<String> s = new ArrayList<String >();
        s.add("吃饭");
        s.add("nice");
        s.add(0,"nice");
        alList.addAll(s);
        //alList.removeAll(s);
        //System.out.println(alList);
        //getData(alList);
//        toArray(alList);
        subList(alList);
//        listIterator(alList);
    }

    private static void subList(List<String> alList) {
        List alList1 = alList.subList(0,3);
        getData(alList1);
    }

    private static void listIterator(List<String> alList) {
        ListIterator iterator = alList.listIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + "、");
        }
    }

    private static void toArray(List<String> alList) {
        String[] sArr = alList.toArray(new String[]{});
        for (String a:sArr){
            System.out.print(a+"、");
        }

    }

    public static void getData(List list) {

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"、");
        }


    }
}
