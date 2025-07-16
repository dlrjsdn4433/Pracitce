package com.ProjectNull.practice0716;

public class test6 {
    public static void main(String[] args) {
        System.out.println(checkBMI(184,80));

    }
    public static String checkBMI(double heightCm, double weightKg) {
        double bmi = weightKg/((heightCm/100)*(heightCm/100));
        String result = (bmi>=25)?"25 이상 : 과체중":(bmi<18.5)?"18.5 미만 : 저체중":"18.5 이상~ 24.9 이하 : 정상";
        return result;
    }
}
