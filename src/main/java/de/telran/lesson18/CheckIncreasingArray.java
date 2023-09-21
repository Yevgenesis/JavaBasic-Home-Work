package de.telran.lesson18;

import java.util.Random;

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
