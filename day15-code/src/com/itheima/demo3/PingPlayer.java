package com.itheima.demo3;

/**
 * @Description: TODO
 * @Author: 不會秃头
 * @Date: 2022/12/22 17:41
 */
public class PingPlayer extends Player implements Speak {
    @Override
    public void study() {
        System.out.println("在学打乒乓球！");
    }

    @Override
    public void speak() {
        System.out.println("在说英语！");
    }
}
