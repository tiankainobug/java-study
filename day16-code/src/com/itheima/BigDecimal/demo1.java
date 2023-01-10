package com.itheima.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Description
 * 和BigInteger类似，BigDecimal可以表示一个任意大小且精度准确的浮点数。
 * @Author 不會秃头
 * @Date 2023/1/10 14:15
 */
public class demo1 {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("2424.1231234");
        System.out.println(b1.multiply(b1)); //5876372.91740257162756
        // 可以使用scale来表示小数位数
        System.out.println(b1.scale()); //7

        BigDecimal b2 = new BigDecimal("3232.245120000");
        // stripTrailingZeros方法转换为一个相等的，末尾没有0的BigDecimal
        System.out.println(b2.stripTrailingZeros()); //3232.24512
        System.out.println(b2.scale()); //9
        System.out.println(b2.stripTrailingZeros().scale()); //5

        BigDecimal b3 = new BigDecimal("243200");
        System.out.println(b3); //243200
        // b3整数未经过处理前查小数是0
        System.out.println(b3.scale()); //0
        BigDecimal b4 = b3.stripTrailingZeros();
        System.out.println(b4); //2.432E+5
        // b3经过处理后，查小数位数是-2
        System.out.println(b4.scale()); //-2

        // BigDecimal在做加、减、乘时，不会有精度丢失问题，但是除法会有除不尽的情况，这时就需要指定精度。
        BigDecimal b5 = new BigDecimal("2412.5352");
        BigDecimal b6 = new BigDecimal("123.123123");
        // 三个参数：除数、保留的小数位数、四舍五入
        BigDecimal b7 = b5.divide(b6,5, RoundingMode.UP);
        System.out.println(b7); // 19.59450

        //divideAndRemainder方法，能够获取两个数取模的商和余数。
        // 返回一个数组，第一值为商，第二个为余数
        BigDecimal b8 = new BigDecimal("12.75");
        BigDecimal[] barr = b8.divideAndRemainder(new BigDecimal("0.15"));
        for (BigDecimal item : barr) {
            System.out.println(item); // 85 0.00
        }

        // 比较两个BigDecimal。
        // 第一种:equals。 不但要求两个BigDecimal的值相等，并且要求两个的scale()相等。
        // 第二种:compareTo() 返回负数、正数和0，分别表示小于、大于和相等。



    }
}
