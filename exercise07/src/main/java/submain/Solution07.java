package submain;

import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution 7
         *  Copyright 2021 Alexys Veloz
         */
        /* Aight dawg so the plan is for this is to have this class ask the user what the length and width of the room in feet
         and to scan in the the numbers, double checking their dimensions. Then we're going to head out to another claass where
         we multiply those two number to get square_feet, and then getting square_meters by multiplying the square feet 0.09290304.
         To make things work for sure we're gonna use doubles. and then we'll print out the are of the rectagular room in both square feet and meters.
         */
        System.out.println("Sup dawg! What's the length of the room in feet?");
        Scanner input = new Scanner (System.in);
        String length = input.nextLine();
        double l =Double.parseDouble(length);
        System.out.println("Okay bud, now what's the width of the room in feet?");
        String width = input.nextLine();
        double w =Double.parseDouble(width);
        area_cruncher userarea = new area_cruncher(l,w);
    }
}
