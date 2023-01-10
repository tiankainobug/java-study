package com.itheima.demo1;

/**
 * @Description 内部类的学习与使用
 * @Author 不會秃头
 * @Date 2023/1/9 15:46
 */
public class test {
    public static void main(String[] args) {
        Outer zhaosi = new Outer("zhaosi");
        Outer.Inner inner = zhaosi.new Inner();
        inner.getName();
    }
}

class Outer {
    private String name;
    Outer(String name){
        this.name = name;
    }
    class Inner {
        public void getName(){
            System.out.println("名字是："+Outer.this.name);
        }
    }
}
