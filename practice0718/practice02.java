package com.ProjectNull.practice0718;

import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int sum= 0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("1부터 "+num+"까지의 합 : "+sum);
    }
}
