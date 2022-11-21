package com.itheima.demo;

/**
 * @Description 把int数组中的数据按指定的格式返回一个字符串。
 * 例如：int[] arr = {1,2,3}
 * 返回：[1,2,3]
 * @Author 不會秃头
 * @Date 2022/11/13 0:12
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1 ){
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        System.out.println(sb.toString());
    }
}
