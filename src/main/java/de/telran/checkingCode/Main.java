package de.telran.checkingCode;

public class Main {
    public static void main(String[] args) {
        String x = "x";
        String x1 = new String("x");

        switch (x1) {
            case "x":
                System.out.println("OK!");
                break;
            default:
                System.out.println("NOT OK!");
        }
    }
}
