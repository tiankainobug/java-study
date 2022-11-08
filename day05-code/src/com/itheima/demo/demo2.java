package com.itheima.demo;

/**
 * @Description:
 * 定义一个数组[1,2,3,4,5,6,7,8,9,10],如果是
 * 奇数 变成它的二倍
 * 偶数 变成它的二分之
 * @Author: 不會秃头
 * @Date: 2022/11/7 13:58
 */
public class demo2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                array[i] = array[i] / 2;
            } else {
                array[i] = array[i] * 2;
            }
            System.out.println(array[i]);
        }

    }
}
