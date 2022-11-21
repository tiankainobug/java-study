package com.itheima.demo;

import sun.rmi.runtime.Log;
import sun.security.krb5.internal.crypto.Des;

import javax.script.ScriptContext;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Description 学生管理系统
 * 新增、删除、修改、查询功能
 * @Author 不會秃头
 * @Date 2022/11/21 22:45
 */
public class demo {
    public static void main(String[] args) {
        // 初始化学生列表
        ArrayList<Student> students = new ArrayList<>();
        w: while (true){
            // 欢迎页面
            getPage();
            // 获取操作
            Scanner scanner = new Scanner(System.in);
            int select = scanner.nextInt();
            switch (select){
                case 1:
                    addStudent(students);
                    break;
                case 2:
                    delStudent(students);
                    break;
                case 3:
                    editStudent(students);
                    break;
                case 4:
                    queryStudent(students);
                    break;
                case 5:
                    System.out.println("退出");
                    break w;
                default:
                    break;
            }
        }
    }

    public static void getPage(){
        System.out.println("-------------欢迎来到学生管理系统-------------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：退出");
        System.out.println("请输入您的选择：");
    }

    public static void addStudent(ArrayList<Student> list){
        int id;
        if (list.size() == 0){
            id = 0;
        } else {
            id = list.get(list.size()-1).getId()+1;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生家庭住址：");
        String address = sc.next();
        list.add(new Student(id,name,age,address));
        System.out.println("添加成功！");
    }
    public static void delStudent(ArrayList<Student> list){
        System.out.println("请输入要删除的学生id：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id){
                list.remove(i);
                System.out.println("删除成功！");
                return;
            }
        }
        System.out.println("删除失败！学生不存在！");
    }
    public static void queryStudent(ArrayList<Student> list){
        System.out.println("id     姓名     年龄     家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getId()+"     "+student.getName()+"     "+student.getAge()+"     "+student.getAddress());
        }
    }
    public static void editStudent(ArrayList<Student> list){
        System.out.println("请输入要修改学生的id：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id){
                System.out.println("请输入学生姓名：");
                String name = sc.next();
                System.out.println("请输入学生年龄：");
                int age = sc.nextInt();
                System.out.println("请输入学生家庭住址：");
                String address = sc.next();
                list.set(i, new Student(id, name, age, address));
                System.out.println("修改成功！");
                return;
            }
        }
        System.out.println("修改失败！学生不存在！");
    }
}
