package com.itheima.demo;

/**
 * @Description 找质数
 * 判断101~200之间有多少个素数，并输出所有素数。
 * @Author 不會秃头
 * @Date 2022/11/8 22:47
 */
public class demo2 {
    public static void main(String[] args) {
        for (int i = 101; i <= 200 ; i++) {
            boolean isSushu = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    isSushu = false;
                    break;
                }
            }
            if (isSushu){
                System.out.println(i);
            }
        }
    }
}
