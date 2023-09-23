package de.telran.lesson19;

import java.util.Random;

public class AvergeDigitsOfArray {
    /*
 Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
 Выведите массивы на экран в двух отдельных строках.
 Посчитайте среднее арифметическое элементов каждого массива и сообщите,
 для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
     */
    public static void main(String[] args) {
        Random random = new Random();

        int n = 5;
        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(n + 1);
            array2[i] = random.nextInt(n + 1);
        }

        printArray(array1);
        double arrayAverage1 = calcArrayAverage(array1);

        printArray(array2);
        double arrayAverage2 = calcArrayAverage(array2);


        if (arrayAverage1 > arrayAverage2) {
            System.out.println("Среднее арифметическое элементов больше у первого массива: " + arrayAverage1);
        } else if (arrayAverage1 < arrayAverage2) {
            System.out.println("Среднее арифметическое элементов больше у второго массива: " + arrayAverage2);
        } else {
            System.out.println("Среднее арифметическое элементов обоих массивов равны.");
        }

    }

    // Метод подсчёта среднего арифметического элементов массива
    // И вывод результата на экран
    public static double calcArrayAverage(int[] array) {
        double sum = 0;
        for (int j : array) {
            sum += j;
        }
        double average = sum / array.length;
        System.out.println("Среднее арифметическое элементов = " + average);
        System.out.println();
        return average;
    }

    // Метод вывода массива в консоль
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i != array.length - 1 ? ", " : "\n"));
            // Тернарный оператор выбирает между запятой
            // и переносом строки при последней итерации
        }
    }
}
