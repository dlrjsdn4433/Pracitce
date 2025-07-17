package com.ProjectNull.practice0717;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {

        // 랜덤한 숫자 맞추기 1~10

        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 10 사이의 숫자를 골라주세요.");
        int selectNum =  sc.nextInt();
        int randomNum = (int)(Math.random()*10)+1;

        if(randomNum != selectNum){
            System.out.println("실패입니다.");
        }else{
            System.out.println("성공입니다!!");
        }
        System.out.println("당신이 고른숫자는 "+selectNum+"입니다.");
        System.out.println("당첨 숫자는 "+randomNum+"입니다.");
    }
}
