package de.telran.practice.homeWorkExt_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Input first num: ");
        double x = input.nextDouble();

        System.out.print("Input second num: ");
        double y = input.nextDouble();

        System.out.println("Sum = "+ (x+y));
        System.out.println("Sub = "+ (x-y));
        System.out.println("Muti = "+ (x*y));
        System.out.println("Div = "+ (x/y));




    }
}
