package de.telran.lesson3;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 200;
        int num2 = 23;

        System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + sub(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + mul(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + div(num1, num2));
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double sub(double x, double y) {
        return x - y;
    }

    public static double mul(double x, double y) {
        return x * y;
    }

    public static double div(double x, double y) {
        return x / y;
    }

}
