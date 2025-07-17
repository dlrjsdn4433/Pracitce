package com.ProjectNull.practice0717;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-- 총 급여 계산식 --");
        System.out.println("총 급여 = 월 급여 +(매출액 * 보너스율)");
        System.out.println("");
        System.out.println("-- 매출액 대비 보너스율 --");
        System.out.println("   매출액     보너스율 ");
        System.out.println(" 5천만원 이상    5%   ");
        System.out.println(" 3천만원 이상    3%   ");
        System.out.println("");
        System.out.println(" 1천만원 이상    1%   ");
        System.out.println(" 1천만원 미만    0%   ");

        System.out.print("월 급여 입력 : ");
        int salary = sc.nextInt();
        System.out.print("매출액 입력 : ");
        int total = sc.nextInt();
        int bonusPercetage;

        if(total>=50000000){
            bonusPercetage = 5;
        } else if(total>=30000000){
            bonusPercetage = 3;
        } else if(total>=10000000){
            bonusPercetage = 1;
        } else{
            bonusPercetage = 0;
        }
        int bonus = (int)(total*bonusPercetage*0.01);
        System.out.println("=====================");
        System.out.println("매출액 : "+total);
        System.out.println("보너스율 : "+bonusPercetage+"%");
        System.out.println("월 급여 : "+salary);
        System.out.println("보너스 금액 : "+bonus);
        System.out.println("=====================");
        System.out.println("총 급여 : "+(salary+bonus));


    }
}
