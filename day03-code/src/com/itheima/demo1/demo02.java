package com.itheima.demo1;

/**
 * @Description 隐私数据类型转换
 * @Author 不會秃头
 * @Date 2022/11/5 0:30
 */
public class demo02 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(getType(a + b)); // int类型

        int i = 10;
        long n = 100L;
        double d = 20.0;
        System.out.println(getType(i + n + d)); // double类型

        byte b1 = 10;
        short s = 20;
        long n1 = 100L;
        System.out.println(getType(b1 + s + n1)); // long类型


    }

    /**
     * @param o: object对象
     * @return String
     * @author 不會秃头
     * @description 获取参数的类型
     * @date 2022/11/5 0:43
     */
    public static String getType(Object o) {
        return o.getClass().toString();
    }
}
