package submain;

import java.util.Scanner;

public class Solution08 {

    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution 8
         *  Copyright 2021 Alexys Veloz
         */
        /* Aight I wanna say since there is no constraints on this and it isnt specific, I'm gonna halfass this one by
        not adding in errors or what happens if no one can get a pizza slice or etc. Sorry not sorry i wanna get through these.
        Okay so actual psudocode: similar to the others, we have this class act as an input, prompting the user for how many
        (int) people and how many (int) Pizzas we have. Last but not least we'll prompt them to tell us  how many (int) slices come per pizza.
        and scan all of these answers in, sending it to another class, where we'll do the calculations. Total_slices would be Pizzas  * slices
        and then slice_per would be People / total_slices. to figure out the (int) remainder, we will do modulo (and if that isn't in Java we'll
        go through the documentation to figure out how to that) to figure out how many slices remain. Then (this could be done in another class but i'm lazy)
        we'll send print out slice_per and Remainder in a nice way for them to read, yaaay
         */
        System.out.println("ayo boss how many people are comin' to the event?");
        Scanner input = new Scanner(System.in);
        String People = input.nextLine();
        int people = Integer.parseInt(People);
        System.out.println("aight dawg, now how many Pizzas we buyin'?");
        String Pizzas = input.nextLine();
        int pizzas = Integer.parseInt(Pizzas);
        System.out.println("Last but not least, how many slices come per Pizza?");
        String Slices = input.nextLine();
        int slices = Integer.parseInt(Slices);


        Distribution userslices = new Distribution(people, pizzas, slices);
    }
}

