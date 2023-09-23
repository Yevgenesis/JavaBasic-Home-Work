package de.telran.lesson19;

import java.util.Random;

public class Randomize {
// Вспомогательный класс для генерации диапазона случайных чисел
    public int randomRangeInt(int startRange, int endRange) {
        Random random = new Random();
        return random.nextInt(endRange - startRange + 1) + startRange;

    }
}
