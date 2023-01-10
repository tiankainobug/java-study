package com.itheima.demo4;


interface Person {
    String getName();
    default void run() {
        System.out.println(getName() + " run");
    }
}

class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2023/1/9 14:52
 */
public class test {
    public static void main(String[] args) {
        Person p = new Student("Xiao Ming");
        p.run();
    }
}
