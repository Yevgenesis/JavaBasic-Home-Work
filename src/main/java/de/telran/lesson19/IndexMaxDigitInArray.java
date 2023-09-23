package de.telran.lesson19;

import java.util.Arrays;
import java.util.Random;

public class IndexMaxDigitInArray {
    //    Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
    //    Определите какой элемент является в этом массиве максимальным и
    //    сообщите индекс его последнего вхождения в массив.
    public static void main(String[] args) {
        Randomize rnd = new Randomize();
        int[] array = new int[12];

        int min = -15;
        int max = 15;
        int maxInd = -1;

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.randomRangeInt(min, max);
            if (array[i] > maxInd) {
                maxInd = i;
            }
        }
        System.out.println(Arrays.toString(array));

        // ставит стрелочку под нужным индексом
        printCursor(array, maxInd);

        // Печатает индекс и элемент
        System.out.println("index = " + maxInd + " (" + array[maxInd] + ")");
    }


    public static void printCursor(int[] array, int index) {
        for (int i = 0; i < index; i++) {
            int digitLength = Integer.toString(array[i]).length();
            for (int j = 0; j < digitLength; j++) {
                System.out.print(" ");
            }
            System.out.print("  ");
        }
        System.out.println(" ^");
    }


}
