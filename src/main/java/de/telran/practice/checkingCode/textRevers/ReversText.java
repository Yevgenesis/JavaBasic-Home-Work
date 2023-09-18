package de.telran.practice.checkingCode.textRevers;

public class ReversText {
    public String getStringRevers(String text) {
        String reversedText = "";

        for (int ind = text.length() - 1; ind >= 0; ind--) {
            reversedText = reversedText + text.charAt(ind);
        }
        return reversedText;
    }
}
