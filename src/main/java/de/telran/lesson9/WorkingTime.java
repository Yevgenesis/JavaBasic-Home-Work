package de.telran.lesson9;

import java.util.Random;

public class WorkingTime {
    public static void main(String[] args) {

        Random rnd = new Random();
        int n = rnd.nextInt(28801);
        double hours = ((double) n / 60) / 60;

        System.out.println("До конца рабочего дня осталось.");
        System.out.println("В секундах: " + n + " сек");

        if (hours == 0) {
            System.out.println("Рабочий день закончился");
        } else if (hours < 1) {
            System.out.println("Осталось менее часа");
        } else if (hours < 2) {
            System.out.println("Остался 1 час");
        } else if (hours >= 2 && hours < 5) {
            System.out.println("Осталось " + (int) hours + " часа");
        } else if (hours >= 5) {
            System.out.println("Осталось " + (int) hours + " часов");
        }


    }

}
