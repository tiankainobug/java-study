package com.itheima.demo2;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2023/1/10 9:42
 */
public class EnumTest2 {
    public static void main(String[] args) {
        Weekday2 sun = Weekday2.SUN;
        System.out.println(sun);
        System.out.println(sun.name());
    }
}

enum Weekday2 {
    MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");
    public final int dayValue;
    private final String chinese;

    private Weekday2(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }

    // 重写toString目的是输出时更有可读性
    @Override
    public String toString() {
        return this.chinese;
    }
}