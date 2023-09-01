package de.telran.lesson2;

// Домашняя работа № 2
public class ParseNumbers {

    public static void main(String[] args) {

        int x = 395;

        int hundreds = x / 100;
        int tens = x % 100 / 10 ;
        int units = x % 10;

        System.out.println("Число: " + x + " -> " + hundreds + "," + tens + "," + units);
    }

}
