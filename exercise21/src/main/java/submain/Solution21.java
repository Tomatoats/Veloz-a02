package submain;

import java.util.Scanner;

public class Solution21 {
    private static final Scanner in = new Scanner(System.in);

    private static int readFromUser(String prompt) {
        System.out.println(prompt);
        while (!in.hasNextInt()){
            System.out.println("Please, give me only numbers, 1-12.");
            in.next();
        }
        return in.nextInt();
    }
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution 14
         *  Copyright 2021 Alexys Veloz
         */
        /* Aight dawg so NOW we use switch cases. This one seems a bit easy if not tedious.
        In this class we're gonna prompt the user to give us a number of a month, scanning it in as an int.
        if the number isn't between 1-12, we'll just display an error message and end instead of forcing them
        over and over to get it right since it doesn't say we got to in the instructions sorry not sorry :P
        Then in another class we're gonna have a switch statement where the case equals a string, saying
        "The name of the month is x" where x is the month associated with the number.
         */
        int month_int = readFromUser("Hey dawg! Please  enter the number of the month.");

        if (month_int > 12 || month_int < 1)
        {
            System.out.println("That isn't a number of a month. Please re run this using numbers 1-12, inclusive.");
        }
        else
        {
            month_finder usermonth = new month_finder(month_int);
        }
    }

}
