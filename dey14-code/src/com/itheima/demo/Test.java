package com.itheima.demo;

import java.lang.reflect.Type;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2022/12/5 16:52
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("朱敏");
        person.setAge(18);
        Student student = new Student();
        student.setName("田凯");
        student.setAge(22);
        Admin admin = new Admin();
        admin.setName("管理员");
        admin.setAge(24);

        person.show();
        student.show();
        admin.show();
        System.out.println(student instanceof Person);
        System.out.println(student instanceof Student);
    }

    public void register(Person p){
        p.show();
    }
}
