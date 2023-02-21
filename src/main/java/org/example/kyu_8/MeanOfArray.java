package org.example.kyu_8;

public class MeanOfArray {

    public static void main(String[] args) {
        System.out.println(getAverage(new int[] {1, 2, 3, 4, 5}));

    }
    public static int getAverage(int[] marks){
        int result = 0;
        for (int i = 0; i < marks.length; i++) {
            result += marks[i];
        }
        return result / marks.length;
    }
}
