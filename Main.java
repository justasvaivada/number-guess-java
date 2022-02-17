package com.justasvaivada;

import java.util.Random;
import java.util.Scanner;

public class Main {

//  Method to generate random number
    public static int randomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max + 1);
    }

    public static void main(String[] args) {

//      Initiate scanner for input
        Scanner inputScan = new Scanner(System.in);
//      Get user input for min range
        System.out.print("Min: ");
        int min = inputScan.nextInt();
//      Get user input for max range
        System.out.print("Max: ");
        int max = inputScan.nextInt();

        int genNumber = randomNumber(min, max);
        System.out.println(genNumber);

        int uInput = max + 1;
        while (uInput != genNumber) {
            System.out.print("Enter your guess: ");
            uInput = inputScan.nextInt();
            if (genNumber == uInput) {
                System.out.println("You Win!");
            } else if (genNumber < uInput) {
                System.out.println("Too High!");
            } else {
                System.out.println("Too Low!");
            }
        }
    }
}
