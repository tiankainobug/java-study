package com.itheima.demo2;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2022/12/1 22:02
 */
public class Test {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.ziShow();
    }
}

class Fu {
    String name = "fu";
}

class Zi extends Fu {
    String name = "zi";
    public void ziShow(){
        String name = "ziShow";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
