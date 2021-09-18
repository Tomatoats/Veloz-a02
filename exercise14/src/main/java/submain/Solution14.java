package submain;

import java.util.Scanner;

public class Solution14 {
    private static final Scanner in = new Scanner(System.in);

    private static double readAmountFromUser(String prompt) {
        System.out.println(prompt);
        return in.nextDouble();
    }
    private static String readStateFromUser(String prompt) {
        System.out.println(prompt);
        return in.next();
    }


    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution 14
         *  Copyright 2021 Alexys Veloz
         */
        /* This is a modified tax calculator, where It only calculates tax if in the State
        of Winconsin. So for this class I'm going to prompt the user to give me the order amount,
        scanning it in as a double, and then prompt then to tell me what state they're are in, scanning that in.
        In another class, I'm going to take the double and string to do a tax calculator.
        if the string equals "WI", Then we'll add tax. If not, we won't. Then we'll print out
        the total for  it.
         */
        double amount = readAmountFromUser("How much was the order dawg?");
        String state = readStateFromUser("What state are you in currently?");

        Tax_calculator usertax = new Tax_calculator(amount, state);
    }
}
