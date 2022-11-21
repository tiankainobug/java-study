package com.itheima.demo;

import java.io.StringReader;
import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("请输入金额：");
        // int money = sc.nextInt();
        for (int i = 0; i < 1000000000; i++) {
            System.out.println(getBig(i));
        }
    }
    public static char getCapitalNumber(int num){
        char[] arr = {'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
        return arr[num];
    }
    public static String getBig(int money) {
        String moneyStr = "元";
        int weishu = 0;
        String[] danwei = {"","拾","佰","仟","万","拾","佰","仟","亿"};
        while (true){
            int ge = money % 10;
            money = money / 10;
            // 处理输入为 0 时，输出 零元。
            if (weishu == 0 && money ==0 && ge == 0){
                moneyStr = "零元";
            } else if (ge == 0 && moneyStr.equals("元")) {
                moneyStr = "元";
            } else if (ge == 0 && moneyStr.charAt(0) == '零') {
                moneyStr = moneyStr;
            } else if (ge == 0) {
                moneyStr = getCapitalNumber(ge) + moneyStr;
            } else if (weishu > 4 && ge != 0 && moneyStr.indexOf("万") == -1) {
                moneyStr = getCapitalNumber(ge) + danwei[weishu] + "万" + moneyStr;
            } else {
                moneyStr = getCapitalNumber(ge) + danwei[weishu] + moneyStr;
            }

            weishu ++;
            if (money == 0) break;
        }
        return  moneyStr;
    }
}