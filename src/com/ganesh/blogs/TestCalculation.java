package com.ganesh.blogs;

public class TestCalculation {
    public static void main(String[] args) {
        Calculation<Integer> sum = Integer::sum;
        System.out.println( sum.operation(12,12));
    }
}
