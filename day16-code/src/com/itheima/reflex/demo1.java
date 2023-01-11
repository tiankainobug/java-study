package com.itheima.reflex;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2023/1/11 9:23
 */
public class demo1 {
    public static void main(String[] args) {
        printClassInfo("".getClass());
        printClassInfo(Runnable.class);
        printClassInfo(java.time.Month.class);
        printClassInfo(String[].class);
        printClassInfo(int.class);
    }

    static void printClassInfo(Class cls) {
        System.out.println("Class name: " + cls.getName());  //Class name: java.lang.String
        System.out.println("Simple name: " + cls.getSimpleName()); //Simple name: String
        if (cls.getPackage() != null) {
            System.out.println("Package name: " + cls.getPackage().getName());  //Package name: java.lang
        }
        System.out.println("is interface: " + cls.isInterface()); //is interface: false
        System.out.println("is enum: " + cls.isEnum());  //is enum: false
        System.out.println("is array: " + cls.isArray());  //is array: false
        System.out.println("is primitive: " + cls.isPrimitive());  //is primitive: false
        System.out.println("--------------------------------------------");
    }
}
