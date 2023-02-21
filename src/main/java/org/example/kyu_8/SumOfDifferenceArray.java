package org.example.kyu_8;

import java.util.Arrays;

public class SumOfDifferenceArray {

    public static void main(String[] args) {
       System.out.println(sumOfDifferences(new int[]{10, 1, 2}));
       }
    public static int sumOfDifferences(int[] arr) {
        Arrays.sort(arr);
        if (arr.length <= 1) {
            return 0;
        } else {
            return arr[arr.length - 1] - arr[0];
        }
    }
}
/*
Your task is to sum the differences between consecutive pairs in the array in descending order.
 */
