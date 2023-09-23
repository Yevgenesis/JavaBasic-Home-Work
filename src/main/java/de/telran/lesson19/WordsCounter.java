package de.telran.lesson19;

import java.util.Scanner;

public class WordsCounter {
//Напишите программу, которая определит, сколько слов Вы ввели с консоли.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int wordCount = 0;

        do {
            System.out.print("Введите слово: ");
            if (input.nextLine().isEmpty()) break;
            wordCount++;
        }while (true);

        System.out.println("Количество слов: " + wordCount);
    }
}
