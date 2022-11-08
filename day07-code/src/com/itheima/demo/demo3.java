package com.itheima.demo;

import java.util.Random;

/**
 * @Description
 * 生成一个5位验证码
 * 前面4位是大写字母或者小写字母，最后一位是数字。
 * @Author 不會秃头
 * @Date 2022/11/8 23:04
 */
public class demo3 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i<=25){
                chs[i] = (char) (97 + i);
            }else {
                chs[i] = (char) (65 + i - 26);
            }
        }
        Random rd = new Random();
        String randomContent = "";
        for (int i = 0; i < 4; i++) {
            randomContent = randomContent + chs[rd.nextInt(chs.length)];
        }
        System.out.println(randomContent+rd.nextInt(10));
    }
}
