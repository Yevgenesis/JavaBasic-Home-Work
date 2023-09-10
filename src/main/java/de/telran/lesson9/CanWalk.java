package de.telran.lesson9;

public class CanWalk {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk;

        if (isWeekend && !isRain) canWalk = true;
        else canWalk = false;

        System.out.println("Идём гулять?: " + canWalk);
    }
}
