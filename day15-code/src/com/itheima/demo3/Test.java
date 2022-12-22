package com.itheima.demo3;

/**
 * @Description: TODO
 * @Author: 不會秃头
 * @Date: 2022/12/22 17:45
 */
public class Test {
    public static void main(String[] args) {
        LanPlayer lanPlayer = new LanPlayer();
        PingPlayer pingPlayer = new PingPlayer();
        LanTeacher lanTeacher = new LanTeacher();
        PingTeacher pingTeacher = new PingTeacher();
        lanPlayer.study();
        pingPlayer.speak();
        pingPlayer.study();
        lanTeacher.teach();
        pingTeacher.speak();
        pingTeacher.teach();
    }
}
