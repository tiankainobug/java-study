package com.itheima.demo;

/**
 * @Description
 * JDK12中 switch的新特性
 * @Author 不會秃头
 * @Date 2022/11/6 0:12
 */
public class demo1 {
    public static void main(String[] args) {
        int number = 1;
        switch (number){
            case 1 -> {
                System.out.println('一');
            }
            case 2 -> {
                System.out.println('二');
            }
            case 3 -> {
                System.out.println('三');
            }
            default -> {
                System.out.println('四');
            }
        }
    }
}
