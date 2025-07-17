package com.ProjectNull.practice0717;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("당첨번호가 어떻게 되세요?");
        int luckyNum = sc.nextInt();
        if(luckyNum>=1&&luckyNum<=10) {
            if (luckyNum % 2 == 0) {
                System.out.println("짝수네요, 모자 선물입니다!");
            } else {
                System.out.println("홀수네요, 인형 선물입니다!");
            }
        }else{
            System.out.println("당첨번호는 1~10 사이에만 있어요.");
        }

    }
}
