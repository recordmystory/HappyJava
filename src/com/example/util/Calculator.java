package com.example.util;

public class Calculator {
    public int plus(int x, int y){
        return x+y;
    }

    public int minus(int x, int y){
        return x-y;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int value1=cal.plus(10, 100);
        System.out.println(value1);

        int value2=cal.minus(100, 20);
        System.out.println(value2);
    }
}
