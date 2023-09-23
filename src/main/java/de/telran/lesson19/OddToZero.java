package de.telran.lesson19;

import java.util.Random;

public class OddToZero {
    /*
Создайте массив из 8 случайных целых чисел из отрезка [1;10]
 Выведите массив на экран в строку.
 Замените каждый элемент с нечётным индексом на ноль
 Снова выведете массив на экран на отдельной строке
     */
    public static void main(String[] args) {

        Randomize random = new Randomize();
        int[] listNum = new int[8];

        int min = 1, max = 50;
        int len = listNum.length;

        for (int i = 0; i < len; i++) {
            listNum[i] = random.randomRangeInt(min, max);
            System.out.print(listNum[i] + (i != len - 1 ? ", " : "\n"));
            // Тернарный оператор выбирает между запятой
            // и переносом строки при последней итерации
        }

        for (int i = 0; i < len; i++) {
            if (i % 2 != 0) listNum[i] = 0;
            System.out.print(listNum[i] + (i != len - 1 ? ", " : "\n"));
        }

    }
}
