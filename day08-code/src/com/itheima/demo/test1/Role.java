package com.itheima.demo.test1;

import java.util.Random;

/**
 * @Description TODO
 * @Author 不會秃头
 * @Date 2022/11/9 21:54
 */
public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }
    /**
     * @param role: 被攻击的对象
     * @return void
     * @author 不會秃头
     * @description 攻击的方法
     * @date 2022/11/9 21:57
     */
    public void attack(Role role){
        Random rd = new Random();
        int hurtNum = rd.nextInt(20)+1;
        if (hurtNum > role.getBlood()){
            role.setBlood(0);
        }else {
            role.setBlood(role.getBlood() - hurtNum);
        }
        System.out.println(this.name+"对"+role.name+"造成了"+hurtNum+"点伤害，"+role.name+"剩余血量为:"+role.blood);
    }
}
