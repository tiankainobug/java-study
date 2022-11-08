package com.itheima.demo;

/**
 * @Description: 求数组中的最大值
 * @Author: 不會秃头
 * @Date: 2022/11/7 14:18
 */
public class demo4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 22, 30, 18, 21,60, 44};
        int maxNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxNum < arr[i]){
                maxNum = arr[i];
            }
        }
        System.out.println(maxNum);

    }
}
