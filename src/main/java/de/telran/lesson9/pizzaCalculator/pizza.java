package de.telran.lesson9.pizzaCalculator;

public class pizza {
    String name;
    int size;

    public pizza(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getCalories() {
        double s = Math.PI * Math.pow((double) size / 2, 2); // Вычисляем площадь пиццы: s = PI * r^2
        return (int) Math.round(s * 40);
    }

    public void printPizzaInfo() {
        System.out.println("Пицца: «" + name + "»");
        System.out.println("Размер: " + size + " см.");
        System.out.println("Калорийность: " + getCalories() + " кал.");
        System.out.println();
    }
}
