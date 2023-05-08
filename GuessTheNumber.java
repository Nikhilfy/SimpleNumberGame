package com.Nikhil;

import java.util.Scanner;


public class GuessTheNumber {
    public static void main(String[] args) {
        int answer = (int)(Math.random() * 100) + 1;
        int k = 7;
        Scanner input = new Scanner(System.in);
        System.out.println("Im guessing a number between 1-100 you have 7 guesses to guess the correct number");

        while (k > 0) {
            System.out.print("Guess #" + (6-k) + ": ");
            int guess = input.nextInt();

            if (guess == answer) {
                System.out.println("Congrats, you guessed the correct number! :)");
                break;
            } else if (guess > answer) {
                System.out.println("Oops!!! your guess is too high :( ");
            } else {
                System.out.println("Oops!! your guess is too low :/ ");
            }

            k--;
            if (k > 0) {
                System.out.println("Nice try but you only have " + k + " guesses left.");
            }
        }

        if (k == 0) {
            System.out.println("Oh No, you have ran out of guesses :[ The number was " + answer + ".");
        }

    }
}
