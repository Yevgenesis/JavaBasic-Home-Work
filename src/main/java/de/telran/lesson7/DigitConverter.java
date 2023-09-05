package de.telran.lesson7;

public class DigitConverter {
    public static void main(String[] args) {
        String hexToDec = "333";
        int decToHex = 819;
        String binToDec = "101101";
        int decToBin = 124;


        System.out.println("HEX: " + hexToDec + "\t -> to DEC: " + Integer.parseInt(hexToDec, 16));
        System.out.println("DEC: " + decToHex + "\t -> to HEX: " + Integer.toHexString(decToHex));
        System.out.println("BIN: " + binToDec + "\t -> to DEC: " + Integer.parseInt(binToDec, 2));
        System.out.println("DEC: " + decToBin + "\t -> to BIN: " + Integer.toBinaryString(decToBin));


    }
}
