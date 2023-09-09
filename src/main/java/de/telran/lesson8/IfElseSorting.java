package de.telran.lesson8;

import java.util.Random;

public class IfElseSorting {
    public static void main(String[] args) {

        Random rnd = new Random();

        int x = rnd.nextInt(1000);
        int y = rnd.nextInt(1000);
        int z = rnd.nextInt(1000);

        if (x <= y && y <= z) {
            printSort(x, y, z);
        } else if (x <= z && z <= y) {
            printSort(x, z, y);
        } else if (y <= x && x <= z) {
            printSort(y, x, z);
        } else if (y <= z) {
            printSort(y, z, x);
        } else if (x <= y) {
            printSort(z, x, y);
        } else {
            printSort(z, y, x);
        }
    }

    static void printSort(int min, int mid, int max) {
        System.out.println("По возрастанию: " + min + " " + mid + " " + max);
        System.out.println("По убыванию: " + max + " " + mid + " " + min);
    }
}



