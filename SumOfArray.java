package com.java.ArrayStudy;

public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        int sum = 0;
        for( int i : numbers) {
            sum += i;
        }
        System.out.println(sum);
    }
}
