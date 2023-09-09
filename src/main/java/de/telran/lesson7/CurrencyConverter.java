package de.telran.lesson7;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Курс в отношении к 1 евро
        double usd = 1.0755;
        double uah = 39.6694;
        double rub = 104.9026;

        System.out.print("Введите сумму в ЕВРО: ");
        double euro = input.nextDouble();

        System.out.println("USD: " + roundToHundredths(usd * euro));
        System.out.println("UAH: " + roundToHundredths(uah * euro));
        System.out.println("RUB: " + roundToHundredths(rub * euro));

    }

    static double roundToHundredths(double num) {
        return Math.round(num * 100.0) / 100.0; // Это используют для банковского округления
    }
}
