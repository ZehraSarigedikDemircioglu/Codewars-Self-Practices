package org.example.kyu_7;

import java.util.ArrayList;

public class NumberOfPeopleInTheBusWithStream {

    public static void main(String[] args) {

        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{10, 0});
        list.add(new int[]{3, 5});
        list.add(new int[]{2, 5});

        System.out.println(countPassengers(list)); // 5
    }
    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
    }
}
