package com.itheima.demo;

/**
 * @Description: 交换数组的元素
 * @Author: 不會秃头
 * @Date: 2022/11/7 14:23
 */
public class demo5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int t = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = t;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
