package com.java.ArrayStudy;

public class MinAndMaxArray {
    public static void main(String[] args) {
        int array[] = {12, 3, 43, 76, 87, 900, 456, 974, 2};
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Maximum value of this array is  " + max);
        System.out.println("Minimum value of this array is  " + min);
    }
}
