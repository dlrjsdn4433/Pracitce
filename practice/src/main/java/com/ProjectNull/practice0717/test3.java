package com.ProjectNull.practice0717;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름과 생년월일을 입력해주세요.");
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("월 : ");
        int month = sc.nextInt();
        System.out.print("일 : ");
        int day = sc.nextInt();
        String present = "";

        if(month>=1&&month<=6&&day>=1&&day<=15){
            present += "배민 쿠폰";
            System.out.println(name+"님의 선물은 "+present+"입니다.");
        } else if (month>=7&&month<=12&&day>=16&&day<=31){
            present += "스타벅스 커피";
            System.out.println(name+"님의 선물은 "+present+"입니다.");
        } else if(month>=13||day>=32){
            System.out.println("생년월일을 정확하게 입력해주세요");
        }
        else {
            present += "사탕";
            System.out.println(name+"님의 선물은 "+present+"입니다.");
        }


    }
}
