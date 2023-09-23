package de.telran.practice.lessonPactic19.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
//    Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
//    Введенное пользователем число сохраняется в переменную n.
//    Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
//    Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
//    Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Input size of array bigger then 3: ");
            n = input.nextInt();
            if (n <= 3) System.out.println("Wrong Input! Try Again please.");
        } while (n <= 3);

        int[] massive = new int[n];
        Random random = new Random();

        int evenCount = 0;

        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(n + 1);
            if (massive[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println(Arrays.toString(massive));
        int count = 0;
        int[] massiveEven = new int[evenCount];
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0) {
                massiveEven[count] = massive[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(massiveEven));


    }
}
