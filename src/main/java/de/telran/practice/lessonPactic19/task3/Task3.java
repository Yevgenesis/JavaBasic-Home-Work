package de.telran.practice.lessonPactic19.task3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    //    Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
    //    Определите какой элемент является в этом массиве максимальным и
    //    сообщите индекс его последнего вхождения в массив.
    public static void main(String[] args) {

        int[] array = new int[12];

        int min = -15;
        int max = 15;

        int maxInd = -1;

        for (int i = 0; i < array.length; i++) {
            array[i] = randomIntRange(min, max);
            if (array[i] > maxInd) {
                maxInd = i;
            }
        }
        System.out.println(Arrays.toString(array));

        printCursor(array, maxInd);
        // ставит стрелочку под нужным индексом

        System.out.println("index = " + maxInd + " (" + array[maxInd] + ")");
        // Печатает индекс и элемент
    }

    public static int randomIntRange(int begin, int end) {
        Random random = new Random();
        return random.nextInt(end - begin + 1) + begin;
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
