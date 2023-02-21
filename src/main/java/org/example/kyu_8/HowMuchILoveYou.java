package org.example.kyu_8;

public class HowMuchILoveYou {
    public static void main(String[] args) {

        System.out.println(howMuchILoveYou(35));
    }
    public static String howMuchILoveYou(int n) {

        switch (n % 6){
            case 1:
                return "I love you";
            case 2:
                return "a little";
            case 3:
                return "a lot";
            case 4:
                return "passionately";
            case 5:
                return "madly";
            case 0:
                return "not at all";
            default:
                return "";
        }
    }
}
