package com.itheima.demo;

import java.util.Scanner;

/**
 * @Description: 逢7过
 * 从任意一个数字开始报数，当你要报的数字是包含7或者7的倍数时，都要说 过。
 * @Author: 不會秃头
 * @Date: 2022/11/7 11:12
 */
public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int number = sc.nextInt();
            if (number % 7 == 0){
                System.out.println('过');
            }
        }
    }
}
