package de.telran.lesson9;

public class CanBay {
    public static void main(String[] args) {
        boolean isEdekaOpen = false;
        boolean isReweOpen = true;

        System.out.println("Я могу купить еду, это " + canBay(isEdekaOpen, isReweOpen));
    }

    public static boolean canBay(boolean edeka, boolean rewe) {
        return edeka || rewe;
    }
}
