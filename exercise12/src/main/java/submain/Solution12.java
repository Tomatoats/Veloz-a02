package submain;

import java.util.Scanner;

public class Solution12 {
    private static final Scanner in = new Scanner(System.in);
    private static double readFromUser(String prompt) {
        System.out.println(prompt);
        return in.nextDouble();
    }
    public static void main(String[] args) {

        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution 12
         *  Copyright 2021 Alexys Veloz
         */
        /* So this one is an interest calculator, where A = P(1 + rt). One note is that
        they want rate as a percentage, so for math reasons i will have to divide that rate by 100
        before playing around with it in the interest calculator.  In this class I will prompt
        the user for the principal, interest rate, and the amount of years, scanning these in.
        then in another class, interest_calculator,  I will plug these numbers into the formula and
        print out that after x years at y%, the investment will be worth $z, formatting the money part using %.2f
         */
        double principal = readFromUser("Sup boss, what's the principal?");
        double interest_rate = readFromUser("Now,what's the interest rate (as a percentage)?");
        double years = readFromUser("Last but not least bud, how many years are you holding this?");

        Interest_Calculator userinvestment = new Interest_Calculator(principal, interest_rate, years);
    }

}
