package com.ProjectNull.practice0717;

public class test10 {
    public static void main(String[] args) {

        // 슬롯머신
        int num1 = (int)(Math.random()*7)+1;
        int num2 = (int)(Math.random()*7)+1;
        int num3 = (int)(Math.random()*7)+1;
        System.out.println("===========");
        System.out.println("  "+num1+"  "+num2+"  "+num3+"  ");
        System.out.println("===========");
        if(num1==num2&&num2==num3&&num3==num1){
            System.out.println("당첨입니다!");
            if(num1==7){
                System.out.println("축하드립니다 잭팟입니다!");
            }
        }
    }
}
