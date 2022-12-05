package com.itheima.demo2;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2022/12/5 18:00
 */
public class Dog extends Animal{

    @Override
    public void eat(String sm){
        System.out.println(this.getAge()+"岁的"+this.getColor()+"颜色的狗两只前腿死死的抱住"+sm+"猛吃");
    }
}
