package com.newblue.jdkstudy.chapter13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by levi on 2014/11/19.
 */
class StudentT {
    private String name;
    private int age;
    private School school;

    public StudentT(String name, int age) {
        setName(name);
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "姓名:"+this.name+"年龄:"+this.age+"学校:"+this.school.getName();
    }
}

class School {
    private String name;
    private List<StudentT> students = new ArrayList<StudentT>();

    public School(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentT> getStudents() {
        return students;
    }

    public void setStudents(List<StudentT> students) {
        this.students = students;
    }
}

public class Chapter13Demo10 {
    public static void main(String args[]) {
        StudentT s1 = new StudentT("小明", 21);
        StudentT s2 = new StudentT("小白", 22);
        StudentT s3 = new StudentT("小黑", 23);
        School school = new School("清华");
        school.getStudents().add(s1);
        school.getStudents().add(s2);
        school.getStudents().add(s3);
        s1.setSchool(school);
        s2.setSchool(school);
        s3.setSchool(school);
        Iterator<StudentT> it = school.getStudents().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
