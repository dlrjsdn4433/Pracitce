package com.ProjectNull.practice0717;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("나이가 어떻게 되세요?");
        int age = sc.nextInt();
        if (age <= 19) {
            System.out.println("판매 불가능합니다. 음료 코너에서 골라주세요.");
        }else{
            System.out.println("판매 가능합니다.");
        }
    }
}
