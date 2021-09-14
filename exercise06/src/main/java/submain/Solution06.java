package submain;

import java.util.Scanner;

public class Solution06 {

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 6
 *  Copyright 2021 Alexys Veloz
 */

/* alright so here's the gist: this is a retirement calculator, so I need to get
input from the user of what age they are and what age they'd like to retire.
This is  gonna happen by me printing out statements asking that and having their input scanned in.
(hey also remember they come in as strings so we're gonna have to convert to int using parseInt)
Then since I need to use more than just one class, i'm gonna use these two infos to call another class where
using system time from Java, which I will figure out by looking through documentation,
I will do arithmetic of years_needed to = age_retirement - age_current, THEN add years_needed to year_current
to find year_retirement,  where it will print out a statement telling the use what year they can retire.
 */
public static void main(String[] args){

    System.out.println("Hey Dawg! Welcome to your retirement calculator. What's your current age?");
    Scanner input = new Scanner (System.in);
    String current_age = input.nextLine();
    int age_current =Integer.parseInt(current_age);
    System.out.println("Thanks, buddy! Now, what age do you wish to retire?");
    String retirement_age = input.nextLine();
    int age_retirement =Integer.parseInt(retirement_age);

    Retirement_Calculator userRetirement = new Retirement_Calculator(age_current, age_retirement);

}
}