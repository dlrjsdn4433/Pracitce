package com.ProjectNull.practice0716;

public class test10 {
    public static void main(String[] args) {
        System.out.println(getMax(1,1,1));

    }
    public static int getMax(int a, int b, int c){
        int maxNum=(a>b&&a>c)?a:(b>a&&b>c)?b:(c>a&&c>b)?c:0;
        return maxNum;
    }
}
