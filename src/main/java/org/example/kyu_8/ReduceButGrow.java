package org.example.kyu_8;

public class ReduceButGrow {

    public static void main(String[] args) {

        System.out.println(grow(new int[] {1, 2, 3, 4}));

    }
    public static int grow(int[] x){
        int result = 1;

        for (int i = 0; i < x.length; i++) {
            result *= x[i];
        }
        return result;

    }
}
