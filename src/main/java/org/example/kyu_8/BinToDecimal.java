package org.example.kyu_8;

public class BinToDecimal {

    public static void main(String[] args) {

        System.out.println(binToDecimal("110000101010100010011"));
    }
    public static int binToDecimal(String inp){
        return Integer.parseInt(inp, 2);
    }
}
