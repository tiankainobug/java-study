package com.itheima.demo;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2022/12/5 16:50
 */
public class Student extends Person{
    @Override
    public void show(){
        System.out.println("学生的信息为："+this.getName()+this.getAge());
    }
}
