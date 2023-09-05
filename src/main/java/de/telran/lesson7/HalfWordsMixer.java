package de.telran.lesson7;

import java.util.Scanner;

public class HalfWordsMixer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое слово с чётным количеством букв: ");
        String word1 = input.nextLine();

        System.out.println("Введите первое слово с чётным количеством букв: ");
        String word2 = input.nextLine();

        String newWord = word1.substring(0, word1.length() / 2) + word2.substring(word2.length() / 2);
        System.out.println("Результат: " + newWord);
    }
}
