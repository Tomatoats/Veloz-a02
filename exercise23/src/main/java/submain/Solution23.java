package submain;

import java.util.Scanner;

public class Solution23 {
    private static final Scanner in = new Scanner(System.in);

    private static String readFromUser(String prompt) {
        System.out.println(prompt);
        return in.next();
    }

    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution 23
         *  Copyright 2021 Alexys Veloz
         */
        /* SO for this one I don't really know how to seperate this into 2 classes
        cause it's just following an if/else loop but I got an idea. In this class I'mma write down the if/else tree here
        and scan in the user answers. then once the tree ends and we got an answer Imma save each answer
        as a different int, and in another class imma use a switch statement to know which final string to print out.
         */
        int answer = 0;
        String start = readFromUser("(Type 'y' or 'n') Is the car silent when you turn the key?");
        if (start.equals("y"))
        {
            start = readFromUser("(Type 'y' or 'n') Are the battery terminals corroded?");
            if (start.equals("y"))
            {
                answer = 1;
            }
            else if (start.equals ("n"))
            {
                answer = 2;
            }
            else
            {
                answer = 0;
            }
        }
        else if (start .equals("n"))
        {
            start = readFromUser("(Type 'y' or 'n') Does the car make a slicking noise?");
            if (start .equals("y"))
            {
                answer = 3;
            }
            else if (start .equals ("n"))
            {
                start = readFromUser("(Type 'y' or 'n') Does the car crank up but fail to start?");
                if (start .equals("y"))
                {
                  answer = 4;
                }
                else if (start .equals ("n"))
                {
                    start = readFromUser("(Type 'y' or 'n') Does the engine start and then die?");
                    if (start .equals("y"))
                    {
                        start = readFromUser("(Type 'y' or 'n') Does you car have fuel injection?");
                        if (start.equals("y"))
                        {
                            answer = 5;
                        }
                        else if (start .equals ("n"))
                        {
                            answer = 6;
                        }
                        else
                        {
                            answer = 0;
                        }
                    }
                    else if (start .equals("n"))
                    {
                        answer = 7;
                    }
                    else
                    {
                        answer = 0;
                    }
                }
                else
                {
                    answer = 0;
                }
            }
            else
            {
                answer = 0;
            }

        }
        else
        {
            answer = 0;
        }
        the_answer useranswer = new the_answer (answer);
    }
}