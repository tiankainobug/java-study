package com.itheima.reflex;

import java.lang.reflect.Field;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2023/1/11 10:24
 */
public class demo3 {
    public static void main(String[] args) throws Exception {
        PersonNew p1 = new PersonNew("小明");
        Class<? extends PersonNew> p1Class = p1.getClass();
        Field name = p1Class.getField("name");
        System.out.println(name.getName());  // name
        System.out.println(name.getModifiers());  // 1
        System.out.println(name.getType());  // class java.lang.String
        // 获取p1实例的name字段值
        System.out.println(name.get(p1));  // 小明
        // 更改p1实例的name字段值
        name.set(p1,"小黑");
        System.out.println(name.get(p1));  // 小黑
    }
}

class PersonNew {
    public String name;
    public PersonNew(String name){
        this.name = name;
    }
}
