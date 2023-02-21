package org.example.kyu_8;

import java.util.Arrays;

public class InvertValues {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(invert(new int[]{1, 2, -3, 4, 5})));

    }

    public static int[] invert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -arr[i];
        }
        return arr;
    }
}
/*
Given a set of numbers, return the additive inverse of each.
Each positive becomes negatives, and the negatives become positives.
 */
