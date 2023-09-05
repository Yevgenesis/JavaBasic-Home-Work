package de.telran.lesson7.Calculator;


import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Введите первое число: ");
        double x = input.nextDouble();
        System.out.print("Введите второе число: ");
        double y = input.nextDouble();

        calc.printAddition(x,y);
        calc.printSubtraction(x,y);
        calc.printMultiplication(x,y);
        calc.printDivision(x,y);

    }
}
