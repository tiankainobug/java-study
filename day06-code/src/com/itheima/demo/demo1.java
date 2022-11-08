package com.itheima.demo;

/**
 * @Description
 * 定义一个方法copyOfRange(int[] arr,int from,int to)
 * 将数组arr中从索引from（包括from）开始，到索引to结束(不包括to)的元素复制到新数组中，将新数组返回。
 * @Author 不會秃头
 * @Date 2022/11/8 20:16
 */
public class demo1 {
    public static void main(String[] args) {
        int[] arr = copyOfRange(new int[]{1, 2, 3, 4, 5}, 2, 4);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static int[] copyOfRange(int[] arr,int from,int to){
        int length = to - from;
        int[] newArr = new int[length];
        for (int i = from; i < to; i++) {
            newArr[i - from] = arr[i];
        }
        return newArr;

    }

}
