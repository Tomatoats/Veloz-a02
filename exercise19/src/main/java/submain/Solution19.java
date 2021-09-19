package submain;

import java.util.Scanner;

public class Solution19 {
    private static final Scanner in = new Scanner(System.in);

    private static double readFromUser(String prompt) {
        System.out.println(prompt);
        while (!in.hasNextDouble()) {
            System.out.println("Please try again, using numbers only!");
            in.next();
        }
        return in.nextDouble();
    }

    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution 19
         *  Copyright 2021 Alexys Veloz
         */
        /* Alright so this one is a BMI calculator. SO for this class I'm going to prompt the user to
        give me their weight and height, making sure they only give numerical values. THen, in another class,
        I'm going to take their weight and height and apply it to a BMI calculator, printing out their bmi and
        whether they are under, over, or typical weight using if / else statements. Actually scratch that: I haven't tried
        switch cases in java. Anyway whether I use if/else or switch, I'll print out the user's BMI and whether they are
        under, above, or the ideal weight.
         */
        double weight = readFromUser("Hey dawg! How much do you weigh (in pounds)?");
        double height = readFromUser("Alright bud, now in inches, what's your height?");

        BMI_calculator userBMI = new BMI_calculator(weight, height);
    }
}
