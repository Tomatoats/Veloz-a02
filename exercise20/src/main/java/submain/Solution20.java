package submain;

import java.util.Scanner;

public class Solution20 {
    private static final Scanner in = new Scanner(System.in).useDelimiter("\n");

    private static double readAmountFromUser(String prompt) {
        System.out.println(prompt);
        return in.nextDouble();
    }

    private static String readStringFromUser(String prompt) {
        System.out.println(prompt);
        return in.next();
    }


    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution 20
         *  Copyright 2021 Alexys Veloz
         */
        /* So, this is another modified tax calculator, but with more paramaters.
        This time,  both state and county matters, and certain counties add on to the tax amount.
        Regardless though, the syntax is still the same. Use this class to take in the amount, state, and county,
        scanning in the user's answers, and send that to another class where if it is a specified county and/or state, it adds
        tax, otherwise, it  doesn't add any tax. Then, potentially print out the tax amount, definitely print out total.
        Oh also it didn't state capitalization SO if you want this to work, it must be "Wisconsin", "Illinois" for state
        and "Eau Claire" or "Dunn" for county for it to work. Sorry not sorry.
         */
        double order = readAmountFromUser("How much is the order amount, boss?");
        String state = readStringFromUser("And what state do you live in currently?");
        String county;
        if (state .equals("Wisconsin"))
        {
            county = readStringFromUser("Now, which County do you live in?");
        }
        else
        {
            county = "ignore";
        }
        Tax_calculator usertotal = new Tax_calculator(order, state, county);

    }
}