package com.itheima.list;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2022/11/21 22:29
 */
public class demo2 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone phone1 = new Phone("小米", 1000);
        Phone phone2 = new Phone("苹果", 8000);
        Phone phone3 = new Phone("锤子", 2999);
        list.add(phone1);
        list.add(phone2);
        list.add(phone3);
        ArrayList<Phone> phone = getPhone(list);
        for (int i = 0; i < phone.size(); i++) {
            System.out.println("品牌："+phone.get(i).getLogo()+",价格："+phone.get(i).getPrice());
        }
    }

    public static ArrayList<Phone> getPhone(ArrayList<Phone> list){
        ArrayList<Phone> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000){
                newList.add(list.get(i));
            }
        }
        return newList;
    }

}
