package submain;

import java.util.Scanner;

public class Solution15 {
    private static final Scanner in = new Scanner(System.in);

    private static String readFromUser(String prompt) {
        System.out.println(prompt);
        return in.next();
    }
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution 15
         *  Copyright 2021 Alexys Veloz
         */
        /* Hey so for this one we're making a password input. It says I should prompt
        for username and password  in directions however in the example it doesn't show the username
        part. I'm still gonna go with what the words say by asking username and password. If this is wrong,
        sue me. don't actually I'm poor college student.
        IMPORTANT: the password is gonna be hardcoded to "Puppies". The Username will not be
        hard coded, so essentially the password for every username is Puppies . Unsecure? Yeah.
        Do I care? Not at the moment, no, I rather have this done.
        If you'd like to change the password to something else for testing services, edit String "actualpass" in
        class "YouShallNotPass".
        oh actual psuedocode uhhhh in this class I'll ask for username and password, prompting it and scanning it in. I'm
        only sending password to another class though in which I check the string sent from the user to the password I have in code.
        If they are the same, they're in. If not, they get "I don't know you."
         */
        String username = readFromUser("Hello dawg! What's your username?");
        String password = readFromUser("Thanks! Now, what's your password?");

        YouShallNotPass userpass = new YouShallNotPass(password);
    }
}
