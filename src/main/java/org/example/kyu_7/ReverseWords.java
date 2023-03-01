package org.example.kyu_7;

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(reverseWords("Java is fun"));
    }

    public static String reverseWords(String str){
        String reverse = "";

        for(int i = str.length() - 1 ; i >= 0; i-- ){
                reverse += str.charAt(i);
            }
            return reverse;
    }
}
