package de.telran;

public class Main {
    public static void main(String[] args) {
        byte x = 100; // 0110.0100
        int y = 100; // 0000.0000 - 0000.0000 - 0000.0000 - 0110.0100
        int z = 10000; // 0000.0000 0000.0000 0010.0111 0001.0000
        byte n = (byte) z;
        System.out.println(n);
    }
}