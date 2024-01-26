package com.example.demo;

public class ArraysEx1 {
    static void sumOfArrays() {
        int[] ages = { 10, 23, 43, 45, 67, 23, 43, 45, 67, 23, 43, 45, 67, 23 };
        // sum of Arrays
        int sum = 0;
        for (int j = 0; j < ages.length; j++) {
            sum = sum + ages[j];
        }
        System.out.println(sum);
    }

    static void serchIndex() {
        int[] ages = { 10, 23, 43, 45, 67, 23, 43, 45, 67, 23, 43, 45, 67, 23 };
        int x = 43;
        int index = -1;
        for (int j = 0; j < ages.length; j++) {

            if (ages[j] == x) {
                index = j;
                break;
            }
        }
        System.out.println(index);
    }

    static void serchMax() {
        int[] ages = { 10, 23, 43, 45, 67, 23, 43, 45, 67, 23, 43, 45, 67, 23, 100 };

        int max = 0;
        for (int j = 0; j < ages.length; j++) {
            if (ages[j] > max) {
                max = ages[j];
            }
        }
        System.out.println(max);
    }

    static void twoDArray() {
        int[][] arr = { { 1, 2, 3 }, { 4, 5,6 }, { 7, 8, 9 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // sumOfArrays();
        // serchIndex();
        // serchMax();
        twoDArray();

    }
}