package com.itheima.list;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2022/11/21 22:29
 */
public class Phone {
    private String logo;
    private double price;

    public Phone() {
    }

    public Phone(String logo, double price) {
        this.logo = logo;
        this.price = price;
    }

    /**
     * 获取
     * @return logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置
     * @param logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

}
