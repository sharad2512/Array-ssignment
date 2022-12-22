package com.java.ArrayStudy;

public class IntegerArray {
    public static void main(String[] args) {
        int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Odd Numbers:");
        for(int i = 0; i < numArr.length; i++){
            if(numArr[i] % 2 == 0){
                System.out.println(i+" Even Number :"+numArr[i]);
            }else {
                System.out.println(i+" Odd Number:"+numArr[i]);}

        } }}

//        System.out.println("Even Numbers:");
//        for(int i=0;i<numArr.length;i++){
//            if(numArr[i]%2==0) {
//                System.out.println(numArr[i]);




