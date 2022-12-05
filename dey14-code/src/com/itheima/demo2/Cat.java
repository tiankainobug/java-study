package com.itheima.demo2;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2022/12/5 18:03
 */
public class Cat extends Animal{

    @Override
    public void eat(String sm){
        System.out.println(this.getAge()+"岁的"+this.getColor()+"颜色的猫咪着眼侧头吃"+sm);
    }
}
