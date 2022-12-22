package com.itheima.demo2;

/**
 * @Description: TODO
 * @Author: 不會秃头
 * @Date: 2022/12/22 15:07
 */
public class Dog extends Animal implements Swim {

    @Override
    public void swim() {
        System.out.println("在游泳！");
    }
}
