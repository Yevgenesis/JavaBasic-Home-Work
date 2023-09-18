package de.telran.practice.checkingCode.positiveOrNegativeDigit;

public class Test {
    public static void main(String[] args) {
        checkEvenOrOdd check = new checkEvenOrOdd();

        int param1 = 4;
        boolean actualResult1 = check.isEven(param1);
        boolean expectedResult1 = true;

        if (actualResult1 == expectedResult1) {
            System.out.println("Test 1 is OK!");
        } else {
            System.out.println("Test 1 is FAIL!");
            System.out.println("Expected result: " + expectedResult1 + ", but received: " + actualResult1);
            System.out.println("but received: " + actualResult1);

        }

        int param2 = -13;
        boolean actualResult2 = check.isEven(param2);
        boolean expectedResult2 = false;

        if (actualResult2 == expectedResult2) {
            System.out.println("Test 2 is OK!");
        } else {
            System.out.println("Test 2 is FAIL!");
            System.out.println("Expected result: " + expectedResult2 + ", but received: " + actualResult2);
            System.out.println("but received: " + actualResult2);

        }
    }
}
