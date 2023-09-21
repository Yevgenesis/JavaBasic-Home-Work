package de.telran.lesson18;

import java.util.Arrays;
import java.util.Random;

public class OddToZero {
    public static void main(String[] args) {

        Random random = new Random();
        int[] listNum = new int[8];

        int min = 1, max = 50;
        int len = listNum.length;

        for (int i = 0; i < len; i++) {
            listNum[i] = random.nextInt(max - min + 1) + min;
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
