package submain;

import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {

        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution 9
         *  Copyright 2021 Alexys Veloz
         */
        /*Aight so the fun thing about this one is we need to round up, which I'll do by putting an if statement
        where if the amount of whole (int) gallons doesnt cover the amount needed, it increments the variable by 1.
        Anyway dawg I'm getting ahead of myself uhhhh so first we're gonna use the first class as an input class mainly,
        prompting the user to give us the length and width (in feet) and scanning those variables in. Then we're going to send that
        to another class in which we'll take those length and width to get the square feet we have. We will then divide
        the squarefeet by 350 (assumed / given from the problem) to figure out how much gallons it would take, and if
        gallon * 350 is less than squarefeet, we'll increment gallon so that we'll have enough to cover it. Then we print
        out the statement of how much gallons the user needs to cover the squarefeet they have.
         */
        System.out.println("Sup dawg! What's the length of the room in feet?");
        Scanner input = new Scanner(System.in);
        String length = input.nextLine();
        int l = Integer.parseInt(length);
        System.out.println("Okay bud, now what's the width of the room in feet?");
        String width = input.nextLine();
        int w = Integer.parseInt(width);
        gallon_calculator userarea = new gallon_calculator(l, w);
    }
}