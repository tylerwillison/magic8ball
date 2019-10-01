package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner keyboard;
	keyboard = new Scanner(System.in);

        Double number;

        System.out.println("Hello, welcome to the magic 8 ball.");
        System.out.println("Pick a number 1-100.");
        number = keyboard.nextDouble();

        if (0>number && number>10){
            System.out.println("It is looking bright.");
        }
        else if (number>10){
            System.out.println("It is not looking too bright.");
        }




















    }
}
