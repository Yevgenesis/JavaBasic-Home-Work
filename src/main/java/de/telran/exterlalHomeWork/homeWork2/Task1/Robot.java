package de.telran.exterlalHomeWork.homeWork2.Task1;

public class Robot {

    String name;

    public Robot(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + name + "!");
        System.out.println();
    }
}
