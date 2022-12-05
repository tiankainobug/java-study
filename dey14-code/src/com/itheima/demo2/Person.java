package com.itheima.demo2;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2022/12/5 18:04
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        return "Person{name = " + name + ", age = " + age + "}";
    }

    public void keepPet(Animal a,String sm){
        if (a instanceof Cat){
            System.out.println("年龄为"+this.getAge()+"岁的"+this.getName()+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的猫");
            a.eat(sm);
        }else if (a instanceof Dog){
            System.out.println("年龄为"+this.getAge()+"岁的"+this.getName()+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的狗");
            a.eat(sm);
        }else {
            System.out.println("没有宠物！");
        }
    }
}
