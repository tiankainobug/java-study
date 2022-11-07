package com.itheima.demo1;

import java.util.Scanner;

/**
 * @Description 输入一个三位数，打印出它的个位数、十位数、百位数。
 * @Author 不會秃头
 * @Date 2022/11/5 0:24
 */
public class demo01 {
    /**
     * @param args:
     * @return void
     * @author 不會秃头
     * @description
     * 公式：
     * 个位：  数字 % 10
     * 十位：  数字 / 10 % 10
     * 百位：  数字 / 10 / 10 % 10
     * ...
     * @date 2022/11/5 0:24
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int nubmer = sc.nextInt();
        // 个位数
        System.out.println(nubmer % 10);
        // 十位数
        System.out.println(nubmer / 10 % 10);
        // 百位数
        System.out.println(nubmer / 100);
    }
}
