package com.itheima.list;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2022/11/13 23:01
 */
public class List {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("元素1");
        strings.add("元素2");
        strings.add("元素3");
        System.out.println(strings);
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
