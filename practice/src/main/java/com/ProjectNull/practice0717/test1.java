package com.ProjectNull.practice0717;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("양수다.");
        }else{
            System.out.println("양수가 아니다.");
        }
    }
}
