package org.example.kyu_8;

import java.util.Arrays;

public class Between {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(between(1, 4)));

    }
    public static int[] between(int a, int b) {
        int[] array = new int[b-a+1];
        for (int i = 0; i < array.length; i++) {
            array[i] = a + i;
        }
        return array;
    }
}
