package com.itheima.demo3;

/**
 * @Description: TODO
 * @Author: 不會秃头
 * @Date: 2022/12/22 17:43
 */
public class PingTeacher extends Teacher implements Speak {

    @Override
    public void teach() {
        System.out.println("在教打乒乓球！");
    }

    @Override
    public void speak() {
        System.out.println("在说英语！");
    }
}
