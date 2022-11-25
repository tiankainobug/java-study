package com.itheima.demo;

import java.util.StringJoiner;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2022/11/25 18:03
 */
public class ArrayUtil {

    // 私有化构造方法，为了不让外界创建他的对象。
    private ArrayUtil(){}

    /**
     * @param arr:
     * @return String
     * @author 不會秃头
     * @description 返回整数数组的内容，返回的格式：[10,20,30]
     * @date 2022/11/25 18:11
     */
    public static void printArr(int[] arr){
        StringJoiner stringJoiner = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            // stringJoiner.add(String.valueOf(arr[i]));
            // stringJoiner.add(arr[i]+"");
            stringJoiner.add(Integer.toString(arr[i]));
        }
        System.out.println(stringJoiner);
    }
    /**
     * @param arr:
     * @return double
     * @author 不會秃头
     * @description 返回平均分
     * @date 2022/11/25 18:47
     */
    public static double getAerage(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum/arr.length;
    }

}
