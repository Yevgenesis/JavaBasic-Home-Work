package de.telran.lesson19;

import java.util.Arrays;

public class ArrayRevers {
    //    Напишите программу, которая меняет местами элементы одномерного массива из String
    //    в обратном порядке. Не используйте дополнительный массив для хранения результатов.
    public static void main(String[] args) {


        String[] massive = {"one", "two", "three", "four"};
        System.out.println(Arrays.toString(massive));

        for (int i = 0; i < massive.length / 2; i++) {
            String temp = massive[i];
            massive[i] = massive[massive.length - i - 1];
            massive[massive.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(massive));
    }
}
