package com.itheima.demo2;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2022/12/5 18:19
 */
public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.setAge(2);
        cat.setColor("黑");
        Animal dog = new Dog();
        dog.setAge(1);
        dog.setColor("白");

        Person person = new Person();
        person.setName("老李");
        person.setAge(25);
        Person person1 = new Person();
        person1.setName("老王");
        person1.setAge(30);

        person.keepPet(cat,"鱼");
        person1.keepPet(dog,"骨头");
    }
}
