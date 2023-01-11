package com.itheima.reflex;

import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2023/1/11 15:58
 */
public class demo5 {
    public static void main(String[] args) throws Exception {
        StudentDemo5 studentDemo5 = new StudentDemo5();
        Method hello = PersonDemo5.class.getMethod("hello");
        hello.invoke(studentDemo5);
        // 下面的代码会报错，子的Method不能调用父类的实例。
        // PersonDemo5 personDemo5 = new PersonDemo5();
        // Method hello = StudentDemo5.class.getMethod("hello");
        // hello.invoke(personDemo5);
    }
}

class PersonDemo5 {
    public void hello() {
        System.out.println("Hello!Person!");
    }
}

class StudentDemo5 extends PersonDemo5 {
    public void hello() {
        System.out.println("Hello!Student!");
    }
}
