package org.example;

public class HelloName {
    public static void main(String[] args) {
        System.out.println(greet("Ryan"));

    }
    public static String greet(String name){
        return "Hello, " + name + " how are you doing today?";
    }
}

