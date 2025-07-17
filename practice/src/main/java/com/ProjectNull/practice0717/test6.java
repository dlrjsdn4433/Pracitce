package com.ProjectNull.practice0717;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("성실 점수 : ");
        int num1 = sc.nextInt();
        System.out.print("서비스 점수 : ");
        int num2 = sc.nextInt();
        System.out.print("미소 점수 : ");
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        double avg = (double)(sum/3);

        if(num1<=100&&num2<=100&&num3<=100){
            if(avg<60){
                System.out.println("평균 점수 미달로 불합격입니다.");
                if(num1<40){
                    System.out.println("성실 점수 미달로 불합격입니다.");
                }
                if(num2<40){
                    System.out.println("서비스 점수 미달로 불합격입니다.");
                }
                if(num3<40){
                System.out.println("미소 점수 미달로 불합격입니다.");
            }
            }else {
                if(num1<40){
                    System.out.println("성실 점수 미달로 불합격입니다.");
                }
                if(num2<40){
                    System.out.println("서비스 점수 미달로 불합격입니다.");
                }
                if(num3<40){
                    System.out.println("미소 점수 미달로 불합격입니다.");
                }
                else{
                    System.out.println("합격입니다.");
                }
            }
        }else{
            System.out.println("인사평가 최대점수는 과목당 100점입니다.");
            System.out.println("점수를 다시 입력해주세요.");
        }

    }
}
