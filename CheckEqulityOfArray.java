package com.java.ArrayStudy;

import java.util.Arrays;

public class CheckEqulityOfArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{20, 5, -95, 43, 17};
        int[] arr2 = new int[]{20, 4, -95, 43, 17};
        boolean flag = true;
        if (arr1.length == arr2.length) {
            System.out.println("Both array length is Equal");
            for (int i = 1; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    flag = false;
                    break;
                }
            }if (flag) {
                System.out.println("Array Element is equal");
            }
         else {
            System.out.println("Array element is Not Equal");
        }
    }
}}
