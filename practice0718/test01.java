package com.ProjectNull.practice0718;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        /* 제어문(조건문,반복문,분기문)을 활용하여  숫자야구 프로그램을 만들어봅시다.*/
        /* [숫자야구 룰]
        * 랜덤한 4자리 숫자열을 선언한다(각 숫자는 중복되지않음 ex)5173
        * 입력한 숫자열과 랜덤한 숫자열을 비교했을 때, 일치하는 숫자가 존재만 하면 존재하는 숫자의 수마다 ball ex)1024=1ball
        * 입력한 숫자열과 랜덤한 숫자열을 비교했을 때, 일치하는 숫자가 위치도 일치하면 숫자의 수마다 strike ex)2147 = 1strike
        * 입력한 숫자열과 랜덤한 숫자열을 비교했을 때, 일치하는 숫자가 1개도 없으면 out ex)2489 = out
        * 입력한 숫자열과 랜덤한 숫자열이 일치할 때 , 정답을 출력
        * 입력 가능한 횟수는 20번으로 제한.
        * */
        Scanner sc=new Scanner(System.in);

        // 중복없는 4자리 숫자열 만들기(String)
        String randomNum ="";
        while(randomNum.length()<4){ // randomNum의 길이가 0,1,2,3일때, 즉 4가 되기 전까지 반복 => 4자리로 만들겠다.
            int random = (int)(Math.random()*10); // 0~9 랜덤숫자 선언 반복
            String str = String.valueOf(random); // 랜덤숫자를 str에 문자열형으로 선언 반복


            boolean isDuplicate = false; // isDuplicate를 false로 선언하고
            for (int i = 0; i<randomNum.length();i++){ //randomNum의 길이가 늘 때마다 반복
                if(randomNum.charAt(i)==str.charAt(0)){ // randomNum 문자열의 i번째 인덱스의 값과 앞으로 추가할 str의 값이 일치하면
                    isDuplicate = true;// inDuplicate를 true로 반환
                    break; // 빠져나가기
                }
            }
            if(!isDuplicate){ // 위에서 중복이면 isDuplicate가 true로 반환되어 !true가 되기때문에 조건 불충, 중복이 아니면 !isDuplicate가 !false가 되기때문에 충족
                randomNum += str;// 조건충족되어서 str추가
            }


        }
        System.out.println(randomNum); // 중복없는 4자리 숫자 문자열 생성 randomNum

        //사용자 입력 만들기
        for (int i = 1; i<=20;i++){ // 20번 반복
            System.out.println(i+"회차"); // n회차
            System.out.print("숫자를 입력해주세요 : ");
            String game = sc.nextLine(); // 게이머가 4자리 숫자열을 입력 반복. game

            int ball=0;
            int strike=0;

            for(int j = 0;j<=3;j++) {
                for (int k = 0; k <= 3; k++) {
                    if (game.charAt(j) == randomNum.charAt(k)) {
                        if(game.charAt(k)==randomNum.charAt(k)){
                            strike+=1;

                        }else{
                            ball+=1;

                        }
                    }else{

                    }

                }
            }
            if(game.equals(randomNum)){
                System.out.println("HOMERUN!!");
                break;
            }
            System.out.print(strike+"strike");
            System.out.println(ball+"ball");
        }
//        System.out.println("사용자 입력 : "+ game +" 랜덤 숫자 : "+randomNum);
        System.out.println("프로그램 종료");



    }
}
