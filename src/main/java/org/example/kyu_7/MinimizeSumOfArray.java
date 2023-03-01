package org.example.kyu_7;


import java.util.Arrays;

public class MinimizeSumOfArray {

    public static void main(String[] args) {
        int[] array = {5, 4, 2, 3};
        System.out.println(minSum(array));
    }

    public static int minSum(int[] array) {
        Arrays.sort(array);
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (i + j == array.length - 1) {
                    result += (array[i] * array[j]);
                }
            }
        }
        return result;
    }
}
/*
Given an array of integers, Find the minimum sum which is obtained from summing each Two integers product.
The minimum sum obtained from summing each two integers product ,  5*2 + 3*4 = 22
 */
