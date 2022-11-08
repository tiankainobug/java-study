package com.itheima.demo;

import java.util.Scanner;

/**
 * @Description 卖飞机票
 * 旺季(5-10)月，头等舱打9折，经济舱8.5折。
 * 淡季(11-4)月，头等舱7折，经济舱6.5折。
 * 输入机票原价、月份、头等舱和经济舱，来计算机票价格。
 * @Author 不會秃头
 * @Date 2022/11/8 22:27
 */
public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double price = sc.nextDouble();
        System.out.println("请输入月份：");
        int mouth = sc.nextInt();
        System.out.println("请输入是头等舱还是经济舱：");
        String cangwei = sc.next();
        double priceDiscount;
        if (5 <= mouth && mouth <= 10){
            priceDiscount = countPrice(cangwei, price, 0.85, 0.9);
        } else {
            priceDiscount = countPrice(cangwei, price, 0.65, 0.7);
        }
        System.out.println("现在的价格是："+priceDiscount);

    }

    /**
     * @param cangwei: 经济舱|头等舱
     * @param price: 原价
     * @param cangweiDiscount1:经济舱折扣
     * @param cangweiDiscount2: 头等舱折扣
     * @return double
     * @author 不會秃头
     * @description TODO
     * @date 2022/11/8 22:44
     */
    public static double countPrice(String cangwei,double price,double cangweiDiscount1,double cangweiDiscount2){
        double priceDiscount;
        switch (cangwei) {
            case "头等舱":
                priceDiscount = price * cangweiDiscount2;
                break;
            case "经济舱":
                priceDiscount = price * cangweiDiscount1;
                break;
            default:
                priceDiscount = price;
                break;
        }
        return priceDiscount;
    }
}
