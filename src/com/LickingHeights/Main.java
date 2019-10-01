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

        if (10>=number && number>0){
            System.out.println("It is looking bright.");
        }
        else if (20>=number && number>10){
            System.out.println("It is not looking too bright.");
        }
        else if (30>=number && number>20){
            System.out.println("Something good will happen soon.");
        }
        else if (40>=number && number>30){
            System.out.println("You might want to look out.");
        }
        else if (50>=number && number>40){
            System.out.println("You have something good coming for you.");
        }
        else if (60>=number && number>50){
            System.out.println("Buses aren't a good thing.");
        }
        else if (70>=number && number>60){
            System.out.println("I hear money.");
        }
        else if (80>=number && number>70){
            System.out.println("Gambling is an addictive thing.");
        }
        else if (90>=number && number>80){
            System.out.println("You will win the lottery.");
        }






















    }
}
