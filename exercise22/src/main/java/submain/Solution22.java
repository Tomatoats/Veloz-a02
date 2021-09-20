package submain;

import java.util.Scanner;

public class Solution22 {
    private static final Scanner in = new Scanner(System.in);

    private static double readFromUser(String prompt) {
        System.out.println(prompt);
        while (!in.hasNextDouble()){
            System.out.println("Please, give me only numbers.");
            in.next();
        }
        return in.nextDouble();
    }
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution 22
         *  Copyright 2021 Alexys Veloz
         */
        /* So in this one we're gonna prompt the user for 3 numbers, scanning them in.
        If any of the numbers are the same, we'll exit the program.
        else, in another class we'll determine who's the higher number using if/else statements.
         */

        double n1 = readFromUser("Heyo, gimme the first number:");
        double n2 = readFromUser("Now dawg gimme a second number:");
        double n3 = readFromUser("Final thing: gimme a third number:");

        if (n1 != n2 && n1 != n3 && n2 != n3)
        {
            highest_number usernumber = new highest_number(n1,n2,n3);

        }
        else
        {
        }
    }
}
