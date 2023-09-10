package de.telran.lesson9;

public class CanBay {
    public static void main(String[] args) {
        boolean isEdekaOpen = false;
        boolean isReweOpen = true;
        boolean canBay;

        if (isEdekaOpen || isReweOpen) canBay = true;
        else canBay = false;

        System.out.println("Я могу купить еду, это " + canBay);
    }
}
