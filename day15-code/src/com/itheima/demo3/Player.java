package com.itheima.demo3;

/**
 * @Description: TODO
 * @Author: 不會秃头
 * @Date: 2022/12/22 17:37
 */
public abstract class Player {
    private String name;
    private int age;

    public Player() {
    }

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void study();

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Player{name = " + name + ", age = " + age + "}";
    }
}
