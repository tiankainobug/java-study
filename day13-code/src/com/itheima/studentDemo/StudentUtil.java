package com.itheima.studentDemo;

import java.util.ArrayList;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2022/11/25 19:07
 */
public class StudentUtil {

    // 私有化构造方法，不让外界创建他的对象
    private StudentUtil(){}

    // 获取学生集合中最大学生的年龄
    public static int getBigAge(ArrayList<Student> arrayList){
        int bigAge = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            int age = arrayList.get(i).getAge();
            if (bigAge < age){
                bigAge = age;
            }
        }
        return bigAge;
    }
}
