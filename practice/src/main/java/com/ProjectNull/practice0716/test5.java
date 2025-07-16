package com.ProjectNull.practice0716;

public class test5 {
    public static void main(String[] args) {
        test5 test = new test5();
        System.out.println(test.discount(40000));

    }
    public double discount(double price){
        double discountedPrice = ((price>=100000)?price*0.8:(price>=50000)?price*0.9:price);

        return discountedPrice;


    }
}
