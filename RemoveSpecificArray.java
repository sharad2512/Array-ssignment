package com.java.ArrayStudy;

public class RemoveSpecificArray {
    public static void main(String[] args) {
        int array[]= {24,32,54,76,93,90};
        int removEle = 76;
        for (int i = 1; i < array.length; i++){
            if (removEle == array[i]){
                for(int j = i; j < array.length-1; j++){
                    array[j]= array[i+1];
                }
                break;
            }
        }
        for (int i= 0; i < array.length-1; i++){
            System.out.println(array[i]);
        }

    }
}
