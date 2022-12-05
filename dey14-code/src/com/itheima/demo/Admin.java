package com.itheima.demo;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2022/12/5 16:51
 */
public class Admin extends Person{
    @Override
    public void show(){
        System.out.println("管理员的信息为："+this.getName()+this.getAge());
    }
}
