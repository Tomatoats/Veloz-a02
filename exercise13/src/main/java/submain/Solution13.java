package submain;

import java.util.Scanner;

public class Solution13 {
    private static final Scanner in = new Scanner(System.in);

    private static double readFromUser(String prompt) {
        System.out.println(prompt);
        return in.nextDouble();
    }

    public static void main(String[] args) {

        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution 13
         *  Copyright 2021 Alexys Veloz
         */
        /* So this is gonna be similar to exercise 12 because they are both
        interest calculators, but this one is a bit more unique because it is a
        compound interest simulator.
         */

        double principal = readFromUser("Sup boss, what's the principal?");
        double interest_rate = readFromUser("Now,what's the interest rate (as a percentage)?");
        double years = readFromUser("How many years are you holding this?");
        double times_comounded = readFromUser("Last but not least bud, how many times per year is the interest compounded?");

        compound_interest_calculator userinvestment = new compound_interest_calculator(principal, interest_rate, years, times_comounded);
    }
}