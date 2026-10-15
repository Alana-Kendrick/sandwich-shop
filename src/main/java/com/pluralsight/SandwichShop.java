package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Do you want a regular or large sandwich? ");
        String size = myScanner.nextLine();

        System.out.print("What is your age? ");
        int age = myScanner.nextInt();

        double basePrice = 0.0;
        double cost;
        
        if (size.equals("regular") || size.equals("Regular")) {
            basePrice = 5.45;
        } else if (size.equals("large") || size.equals("Large")) {
            basePrice = 8.95;
        }
        
        if (age <= 17) {
            cost = basePrice * 0.9;
        } else if (age >= 65) {
            cost = basePrice * 0.9;
        } else {
            cost = basePrice;
        }
        System.out.printf("The price of your sandwich is $%.2f", cost);
    }
}
