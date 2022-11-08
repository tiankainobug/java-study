package com.itheima.demo;

import java.util.Scanner;

/**
 * @Description 评委打分
 * 6位评委打分，分数范围是【0-100】。
 * 去掉一个最高分、去掉一个最低分，求剩余四位评委的平均分。
 * @Author 不會秃头
 * @Date 2022/11/8 23:27
 */
public class demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入6个评委的分数为：");
        double max = 0.0,min = 100.0;
        double count = 0.0;
        double[] arr = new double[6];
        for (int i = 0; i < arr.length;) {
            arr[i] = sc.nextDouble();
            if (arr[i] > 100){
                System.out.println("输入的分数大于100,请重新输入！");
                continue;
            }
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            count += arr[i];
            i++;
        }
        System.out.println("总分为："+count);
        System.out.println("最大分："+max);
        System.out.println("最低分："+min);
        System.out.println("平均分为："+ (count - max - min)/4);

    }
}
