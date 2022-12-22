package com.java.ArrayStudy;

public class FindIndexOfArray{

    public static void main(String[] args) {
        int[] my_array = {5, 4, 6, 1, 3, 2, 7, 8, 9};
        int num = 6;
        for (int i = 0; i < my_array.length; i++){
            if (num == my_array[i]){
                System.out.println("Index of given num is "+i);
            }
        }

    }
}


