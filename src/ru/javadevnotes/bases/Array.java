package ru.javadevnotes.bases;

import java.util.Arrays;

public class Array {

    int[] arr1 = new int[5];
    int arr[] = new int[3];

    int[] arr2 = { 5, 10, 15, 20 };
    int[][] arr3 = new int[10][20]; //двумерный массив


    public void run() {
        System.out.println(Arrays.toString(arr2));

        int[][] table = new int[3][]; //нерегурярный массив
        table[0] = new int[1];
        table[1] = new int[5];
        table[2] = new int[3];

        int lengthOfArr2 = arr2.length; //длина массива
    }
}
