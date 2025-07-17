package com.ProjectNull.practice0717;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {

        System.out.println("가위바위보 게임");
        System.out.println("1. 가위 2. 바위 3. 보");
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int num = (int) (Math.random()*3)+1;
        String numValue="";
        String result ="";
        String draw = "비겼습니다";
        String win = "이겼습니다";
        String lose = "졌습니다";

        if (num == 1) {
            numValue += "가위";
            if(user==1){
                result += draw;
            }else if(user==2){
                result += win;
            }else{
                result += lose;
            }
        } else if (num == 2) {
            numValue += "바위";
            if(user==1){
                result += lose;
            }else if(user==2){
                result += draw;
            }else{
                result += win;
            }
        } else{
            numValue +="보";
            if (user==1){
                result += win;
            }else if(user==2){
                result += lose;
            }else{
                result += draw;
            }
        }

        System.out.println("컴퓨터는 "+numValue+"를 냈습니다.");
        System.out.println(result);
    }
}
