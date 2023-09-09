package de.telran.for_testing;

public class DogApp {
    public static void main(String[] args) {

        Dog myDog = new Dog("Бобик", 3, "Red");

        myDog.voice();

        myDog.happyBirthday();
        myDog.changeColor("Brown");
        myDog.voice();
    }
}
