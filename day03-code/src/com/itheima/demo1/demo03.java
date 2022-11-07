package com.itheima.demo1;

/**
 * @Description 强制类型转换
 * @Author 不會秃头
 * @Date 2022/11/5 0:53
 */
public class demo03 {

    public static void main(String[] args) {
        int a = 200;
        byte b = (byte) a;
        System.out.println(b); // 超出了byte的范围(-128~127)

        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);
    }
}
