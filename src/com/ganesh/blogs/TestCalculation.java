package com.ganesh.blogs;

public class TestCalculation {
    public static void main(String[] args) {
        Calculation<Integer> sum = (Integer a, Integer b)->  a+b;
        System.out.println( sum.operation(12,12));
    }
}
