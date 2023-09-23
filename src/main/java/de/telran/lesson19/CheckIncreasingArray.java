package de.telran.lesson19;

import java.util.Random;
/*
Создайте массив из 5 случайных целых чисел из интервала [10;99]
Выведите его на консоль в строку.
Определите и выведите на экран сообщение о том, является ли
массив строго возрастающей последовательностью (каждый элемент строго больше предыдущего)
 */
public class CheckIncreasingArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numArray = new int[5];


        int min = 10;
        int max = 99;

        boolean flag = true;

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = random.nextInt(max - min + 1) + 1;
            if (i > 0 && numArray[i] < numArray[i - 1] && flag) flag = false;
            System.out.print(numArray[i] + ", ");
        }
        System.out.println("\nМассив с возрастающей последовательностью? - " + flag);


    }
}
