package de.telran.lesson9.pizzaCalculator;

public class CalcculatePizzaCalories {
    public static void main(String[] args) {
        pizza firstPizza = new pizza("Маргарита", 24);
        pizza secondpizza = new pizza("Кальцоне", 28);

        firstPizza.printPizzaInfo();
        secondpizza.printPizzaInfo();

        showPizzaComparison(firstPizza, secondpizza);

    }

    private static void showPizzaComparison(pizza firstPizza, pizza secondpizza) {
        double cal1 = firstPizza.getCalories();
        double cal2 = secondpizza.getCalories();

        System.out.println("Разница в калориях составляет: " + (int) (Math.max(cal1, cal2) - Math.min(cal1, cal2)) + " кал.");
    }


}
