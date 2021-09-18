package submain;

import java.util.Scanner;

public class Solution11 {
    private static double readFromUser(String prompt) {
        System.out.println(prompt);
        return in.nextDouble();
    }
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution 11
         *  Copyright 2021 Alexys Veloz
         */
        /*Alright we're gonna take it a step farther now that I went into class
        wednesday and learned some stuff so ex.11 and onward is gonna look different
        than ex6-10. For this class we're gonna prompt the user for  how many euros they have
        and then how much the exchange rate is, storing these doubles (since the rate won't be
        an integer) and then in another class we're gonna do the math of euro * rate to find dollar,
        and print out how much the user has, using %.2f since they won't need anymore than that money wise.

         */

        double euro = readFromUser("Hey Dawg! Enter how many euro's you have!");
        double rate = readFromUser("Alright, now whats the conversion rate to dollars?");
        Dollar_Calculator usermoney = new Dollar_Calculator(euro, rate);
    }


}
