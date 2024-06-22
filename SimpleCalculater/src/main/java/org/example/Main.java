package org.example;

public class Main {

    public static double add(double a, double b) {
        System.out.print("addition of a and b = ");  System.out.println(a = b);
        return a = b;
    }
    public static double div(double a, double b) {
        System.out.print("division of a and b = ");  System.out.println(a / b);
        return a / b;
    }

    public static double sub(double a, double b) {
        System.out.print("subtraction of a and b = ");
        System.out.println(a - b);
        return a - b;

    }
    public static double mul(double a, double b) {
        System.out.print("multiplication of a and b = ");  System.out.println(a * b);
        return a * b;
    }

    public static void main(String[] args)
    {
        int a=6;
        int b=3;
        add( a,  b);
        div( a,  b);
        sub( a,  b);
        mul( a,  b);

    }
}