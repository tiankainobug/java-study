package com.itheima.list;

import java.util.ArrayList;

/**
 * @Description 添加学生对象并遍历
 * 定义一个集合，添加一些学生对象，并进行遍历。
 * 学生类的属性为：姓名、年龄。
 * @Author 不會秃头
 * @Date 2022/11/13 23:09
 */
public class demo1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("朱敏", 18));
        students.add(new Student("朱德华", 24));
        System.out.println(students);
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.getName() + ',' + student.getAge());
        }
    }
}
