package de.telran.checkingCode.dog;

public class Dog {
    String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void voice() {
        System.out.println("Кличка: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Колор: " + color);
        System.out.println();

    }
    public void changeColor(String color) {
        this.color = color;
    }

    public void happyBirthday(){
        this.age++;
    }

}
