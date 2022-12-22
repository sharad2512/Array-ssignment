package com.java.ArrayStudy;

public class ReverseIntArray {
    public static void main(String[] args) {
        int array[]={21,32,44,77,33,66,88,99,};
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
