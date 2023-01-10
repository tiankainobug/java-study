package com.itheima.demo2;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2023/1/10 9:24
 */
public class EnumTest {
    public static void main(String[] args) {
        WeekDay sun = WeekDay.SUN;
        System.out.println(sun.dayValue);
        System.out.println(sun);
    }
}

enum WeekDay {
    SUN(1),MON(2),TUE(3),WEB(4);
    public final int dayValue;
    private WeekDay(int dayValue) {
        this.dayValue = dayValue;
    }
}
