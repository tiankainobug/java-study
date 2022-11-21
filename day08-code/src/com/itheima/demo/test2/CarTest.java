package com.itheima.demo.test2;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2022/11/12 11:57
 */
public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("坦克300", 24.5, "black");
        Car car2 = new Car("哈佛大狗", 15.5, "white");
        Car car3 = new Car("BJ40", 17.5, "black");
        Car[] cars = new Car[3];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
