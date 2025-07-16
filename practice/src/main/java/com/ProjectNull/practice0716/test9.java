package com.ProjectNull.practice0716;

public class test9 {
    public static void main(String[] args) {
        System.out.println(getAbsoluteValue(-3));
        System.out.println(getAbsoluteValue(4));
        System.out.println(getAbsoluteValue(0));

    }
    public static int getAbsoluteValue(int number){
        int abNum=(number>0)?number:(number<0)?number*-1:0;
        return abNum;
    }
}
