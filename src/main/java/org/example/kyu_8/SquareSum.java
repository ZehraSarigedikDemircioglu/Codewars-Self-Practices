package org.example.kyu_8;

public class SquareSum {

    public static void main(String[] args) {
        System.out.println(squareSum(new int[]{1, -2, 3}));

    }

    public static int squareSum(int[] n) {
        int result = 0;

        for (int each : n) {
            result += each * each;
        }
        return result;
    }
}
