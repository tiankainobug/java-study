package com.itheima.studentDemo;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2022/11/25 19:14
 */
public class Test {
    public static void main(String[] args) {
        Student tiank = new Student("tiank", 25);
        Student zhumin = new Student("zhumin", 24);
        ArrayList<Student> students = new ArrayList<>();
        students.add(tiank);
        students.add(zhumin);
        int bigAge = StudentUtil.getBigAge(students);
        System.out.println(bigAge);
    }
}
