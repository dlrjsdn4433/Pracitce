package com.ProjectNull.practice0716;

public class test8 {
    public static void main(String[] args) {
        System.out.println(getGrade(89));

    }
    public static char getGrade(int score){
        char grade = (score>=90)?'A':
                (score>=80)?'B':
                        (score>=70)?'C':
                                (score>=60)?'D':'F';
        return grade;
    }
}
