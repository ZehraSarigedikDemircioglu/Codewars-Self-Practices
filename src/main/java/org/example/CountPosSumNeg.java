package org.example;

import java.util.Arrays;

public class CountPosSumNeg {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        System.out.println(Arrays.toString(countPositivesSumNegatives(arr)));

    }

    public static int[] countPositivesSumNegatives(int[] input) {

        int[] array = new int[2];
        int count = 0;
        int sumOfNeg = 0;
        if(!(input == null || input.length == 0)) {
            for (int i : input) {
                if (i > 0) {
                    count++;
                } else {
                    sumOfNeg += i;
                }
            }
            array[0] = count;
            array[1] = sumOfNeg;
            return array;
        }else{
            return new int[]{};
        }
    }
}
