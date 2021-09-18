package submain;

import java.util.Scanner;

public class Solution18 {
    private static final Scanner in = new Scanner(System.in);

    private static String readUnitFromUser(String prompt) {
        System.out.println(prompt);
        return in.next();
    }
    private static int readDegreeFromUser(String prompt) {
        System.out.println(prompt);
        return in.nextInt();
    }
    private static int Verifier(String unit){
        if (unit .equals("C") || unit .equals("c")){
            return 1;
        }
        else if (unit .equals("F") || unit .equals("f")){
            return 2;
        }
        else{
            System.out.println("Please run this again and choose either F or C next time.");
            return -1;
        }
    }
    public static void main(String[] args) {
        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution 18
         *  Copyright 2021 Alexys Veloz
         */
        /* Aight  so for this one i'mma put a prompt aking for C for F to C conversion or F for C to F conversion,
        scanning in the string.  Using another function, I'm going to validate whether that string is C or F,  both lower or capital,
        and then  i'll prompt the user  for the temp in F or C respectively to convert it in another class. I'mma try to
        elevate myself by doing some of the things learned in previous examples.
         */
        String unit = readUnitFromUser("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        int verified = Verifier(unit);
        if (verified > 0)
        {
            int degrees = (verified < 2) ? readDegreeFromUser("Please enter the temperature in Fahrenheit.") : readDegreeFromUser("Please enter the temperature in Celsius.");
            Degree_converter usertemp = new Degree_converter(verified, degrees);
        }

    }
}
