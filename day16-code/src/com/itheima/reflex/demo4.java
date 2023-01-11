package com.itheima.reflex;

import java.lang.reflect.Method;
import java.util.TreeMap;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2023/1/11 13:59
 */
public class demo4 {
    public static void main(String[] args) throws Exception {
        Dog dog1 = new Dog("大宝", 2);
        Method getName = dog1.getClass().getMethod("getName",String.class);
        getName.invoke(dog1,"hahh");

        Method setColor = dog1.getClass().getDeclaredMethod("setColor", String.class);
        // 开启权限，调用非public方法。
        setColor.setAccessible(true);
        setColor.invoke(dog1,"白色");
        dog1.getColor();
    }
}

class Animal {
    public String name;
}

class Dog extends Animal{
    public int age;
    public String color;
    public Dog(String name,int age) {
        this.name = name;
        this.age = age;
    }

    // @Override
    public void getName(String name){
        System.out.println("Dog"+this.name+name);
    }

    private void setColor(String color){
        this.color = color;
    }

    public void getColor(){
        System.out.println(this.color);
    }

}
