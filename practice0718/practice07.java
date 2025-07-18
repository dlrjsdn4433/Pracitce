package com.ProjectNull.practice0718;

import java.util.Scanner;

public class practice07 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int i =1;
        String tomato="";
        while(i<=num){
            if(i%2==1){
                tomato += "토";
            }else{
                tomato += "마";
            }
            i++;
        }
        System.out.println(tomato);
    }
}
