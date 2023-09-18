package de.telran.practice.checkingCode.positiveOrNegativeDigit;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = input.nextInt();

        checkEvenOrOdd check = new checkEvenOrOdd();

        if (check.isEven(number)) System.out.println("Число четное");
        else System.out.println("Число не четное");
    }
}

