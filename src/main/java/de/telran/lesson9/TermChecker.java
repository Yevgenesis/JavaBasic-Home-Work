package de.telran.lesson9;

public class TermChecker {
    public static void main(String[] args) {
        int temperature1 = 134;
        int temperature2 = 12;

        System.out.println("Прибор работает?: " + termChecker(temperature1, temperature2));
    }

    static boolean termChecker(int temp1, int temp2) {
        return temp1 > 100 && temp2 < 100;
    }

}

