package submain;

import java.util.Scanner;

public class Solution16 {
    private static final Scanner in = new Scanner(System.in);

    private static int readFromUser(String prompt) {
        System.out.println(prompt);
        return in.nextInt();
    }

    public static void main(String[] args) {
        /*
        *  UCF COP3330 Fall 2021 Assignment 2 Solution 16
        *  Copyright 2021 Alexys Veloz
        */
        /* Aight so for this solution, I'm going to prompt the user for their age in this class.
        Then I'll send it to another class which checks their age. If it is 16 or older, there
        will be an output statement telling them they can drive. Otherwise, it will tell them nawwww
         */

        int age = readFromUser("How old are ya, dawg?");

        Age_verifier userage = new Age_verifier(age);


    }
}
