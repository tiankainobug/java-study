package com.itheima.BigInteger;

import java.math.BigInteger;

/**
 * @Description
 * BigInteger不会有范围限制，但是运算速度会比较慢
 * @Author 不會秃头
 * @Date 2023/1/10 13:59
 */
public class demo1 {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("6723123123");
        // 次方运算
        BigInteger b2 = b1.pow(3);
        System.out.println(b2); //303887750382081247193986461867
        // 加法运算
        BigInteger sum = b1.add(b2);
        System.out.println(sum); //303887750382081247200709584990

        System.out.println(b1.longValue()); //6723123123
        // 如果转换时超过了基本类型的范围，转换时将丢失高位信息
        System.out.println(b1.intValue());  //-1866811469
        // 如果需要准确的转换成基本类型，那么需要使用exact等方法。这时超出了范围，将会直接报错
        System.out.println(b1.intValueExact()); //BigInteger out of int range
    }
}
