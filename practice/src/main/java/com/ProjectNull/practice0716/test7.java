package com.ProjectNull.practice0716;

public class test7 {
    public static void main(String[] args) {
        System.out.println(calculate(1,4,'*'));
        System.out.println(calculate(1,4,'/'));
        System.out.println(calculate(1,4,'-'));
        System.out.println(calculate(1,4,'+'));

    }
    public static double calculate(int a, int b, char operator) {
        double result =
                (operator=='+')?a+b:
                        (operator=='-')?a-b:
                                (operator=='*')?a*b:
                                        (operator=='/'&&b!=0)?a/b:
                                                (b==0)?null:null;
        return result;

    }
}
