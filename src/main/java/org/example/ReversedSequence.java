package org.example;

import java.util.Arrays;

public class ReversedSequence {

    public static void main(String[] args) {
        reverse(5);


    }
    public static int[] reverse(int n){

        int[] array = new int[n];

        for (int i = n, j = 0; i > 0; i--, j++) {
            array[j] = i;
        }
        System.out.println(Arrays.toString(array));
        return array;


    }
}
/*
Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 --> [5,4,3,2,1]
 */

