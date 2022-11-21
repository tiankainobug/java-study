package com.itheima.demo.test1;

/**
 * @Description 游戏比赛
 * 两个角色对打，知道对方死亡。
 * @Author 不會秃头
 * @Date 2022/11/9 21:54
 */
public class GameTest {
    public static void main(String[] args) {
        System.out.println("比赛开始！");
        Role role1 = new Role("鲁智深", 100);
        Role role2 = new Role("杨幂", 100);
        while (true){
            role1.attack(role2);
            if (role2.getBlood() == 0){
                System.out.println(role2.getName()+"寄了！");
                break;
            }
            role2.attack(role1);
            if (role1.getBlood() == 0){
                System.out.println(role1.getName()+"鸡了！");
                break;
            }
        }
    }
}
