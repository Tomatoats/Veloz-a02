package submain;

import java.util.Scanner;

public class Solution17 {
    private static final Scanner in = new Scanner(System.in);

    private static int readFromUser(String prompt) {
        System.out.println(prompt);
        while (!in.hasNextInt()){
            System.out.println("Drunk already? input a number, nothing else");
            in.next();
        }
        return in.nextInt();
    }

    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution 17
         *  Copyright 2021 Alexys Veloz
         */
        /* So for this one, it's gonna follow a similar formula. Have this class Prompt
        the user for their sex (not that kind), how many ounces of alcohol they had, their weight,
        and how mnany hours its been since their last drink, and scan them all in asd ints. Then I'll send it
        to another class in which it'll calculate  their BAC as a double (potentially casting it as a double since
        it's going to be taking int values as variables), and printing out using a ternery operator whether it is legal for them to drive or not.
         */
        int gender = readFromUser("Hello! Please enter a 1 if you're male, or 2 if you're female!");
        int alcohol = readFromUser("Now, how many ounces of alcohol did you consume?");
        int weight = readFromUser("In pounds, what is your weight?");
        int hours = readFromUser("LAst but not least, how many hours has it been since you last drank?");

        BAC_calculator userBAC = new BAC_calculator(gender, alcohol, weight, hours);
    }
}
