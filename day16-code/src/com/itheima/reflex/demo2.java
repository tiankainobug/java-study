package com.itheima.reflex;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2023/1/11 9:36
 */
public class demo2 {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<Student> s1 = Student.class;
        // getField 根据字段名获取某个public字段（包括父类）
        System.out.println(s1.getField("score"));  // public int com.itheima.reflex.Student.score
        System.out.println(s1.getField("name"));  // public java.lang.String com.itheima.reflex.Person.name
        // getDeclaredField 根据字段名获取当前类的某个字段(不包括父类)
        System.out.println(s1.getDeclaredField("grade")); // private int com.itheima.reflex.Student.grade

        Field f1 = s1.getDeclaredField("grade");
        // Field字段可以通过getName()获取字段名
        System.out.println(f1.getName()); //grade
        // Field字段可以通过getType()来获取字段类型
        System.out.println(f1.getType()); //int
        // Field字段可以通过getModifiers()来获取字段的修饰符
        // 返回一个int 可以通过Modifier.isXXXX来判断是不是XXXX修饰符
        int m1 = f1.getModifiers();
        System.out.println(Modifier.isPrivate(m1)); //true
        System.out.println(Modifier.isPublic(m1));  //  false

    }
}

class Person {
    public String name;
}

class Student extends Person {
    public int score;
    private int grade;
}