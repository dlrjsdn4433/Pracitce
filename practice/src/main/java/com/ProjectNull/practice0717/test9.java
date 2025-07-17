package com.ProjectNull.practice0717;

public class test9 {
    public static void main(String[] args) {
        //섯다 머신
        int card1 = (int)(Math.random()*10)+1;
        int card2 = (int)(Math.random()*10)+1;
        String value = "";
        int valueNum = 0;
        if(card1!=card2){
            if(card1+card2>10){
                valueNum = card1+card2-10;
            }else{
                valueNum = card1+card2;
            }
            value += valueNum+"끝";
        }else{
            if(card1==10){
                value += "장땡";
            }else{value += card1+"땡";}

        }
        System.out.println("당신의 카드는 "+card1+", "+card2+"입니다.");
        System.out.println("당신의 패는 "+value+"입니다.");

    }
}
