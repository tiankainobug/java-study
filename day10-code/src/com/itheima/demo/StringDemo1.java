package com.itheima.demo;

import java.util.Scanner;

/**
 * @Description
 * 键盘录入一个字符串，统计大写、小写、数字出现的次数。
 * @Author 不會秃头
 * @Date 2022/11/12 13:25
 */
public class StringDemo1 {
    public static void main(String[] args) {
        int bigNumber = 0;
        int smallNumber = 0;
        int numberCount = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z'){
                bigNumber ++;
            } else if (c >= 'a' && c <= 'z') {
                smallNumber ++;
            } else {
                numberCount ++;
            }
        }
        for (int i = str.length(); i > 0; i--) {
            
        }
        System.out.println("大写："+bigNumber);
        System.out.println("小写："+smallNumber);
        System.out.println("数字："+numberCount);
    }
}
