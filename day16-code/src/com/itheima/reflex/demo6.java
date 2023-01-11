package com.itheima.reflex;

import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2023/1/11 16:34
 */
public class demo6 {
    public static void main(String[] args) throws Exception {
        String s = "Hello World";
        Method substring = String.class.getMethod("substring", int.class);
        String invoke = (String) substring.invoke(s, 6);
        System.out.println(invoke);  //World
    }
}
