package org.example.kyu_8;

public class FirstNonConsecutive {

    public static void main(String[] args) {

        System.out.println(find(new int[]{1, 2, 3, 4, 5, 7}));
    }

    static Integer find(final int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] != array[i] + 1) {
                    return array[i + 1];
                }
            }
        return null;
    }
}
