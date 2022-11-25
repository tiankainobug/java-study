package com.itheima.demo;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2022/11/25 18:48
 */
public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6};
        ArrayUtil.printArr(arr);
        double[] arr2 = {1.1,2.3,45.0,25.3};
        double aerage = ArrayUtil.getAerage(arr2);
        System.out.println(aerage);
    }
}
