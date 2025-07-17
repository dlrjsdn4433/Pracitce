package com.ProjectNull.practice0717;

import java.util.Scanner;

public class test0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 삼항연산자 활용 문제 조건문으로 변환
        System.out.println("정수 2개를 입력해주세요.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1>num2){
            System.out.println("두 수 중 큰 수는 "+num1+"입니다.");
        }else{
            System.out.println("두 수 중 큰 수는 "+num2+"입니다.");
        }
//-----------------------------------------------------------------
        System.out.println("점수를 입력해주세요.");
        int point = sc.nextInt();
        if  (point>=60){
            System.out.println("합격입니다,");
        }else{
            System.out.println("아쉽지만 불합격입니다.");
        }
//-----------------------------------------------------------------
        System.out.println("정수를 1개 입력해주세요.");
        int num3 = sc.nextInt();
        if(num3%2==0){
            System.out.println("입력하신 수는 짝수입니다.");
        }else{
            System.out.println("입력하신 수는 홀수입니다.");
        }
    }
}
