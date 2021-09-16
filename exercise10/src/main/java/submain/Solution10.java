package submain;

import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {

        /*
         *  UCF COP3330 Fall 2021 Assignment 2 Solution 10
         *  Copyright 2021 Alexys Veloz
         */
    /* Last one for today, lets do this: Aight so we need quantity and prices of 3 items, then we gotta output the subtotal,
    tax (5.5%), and Total. We're definitaly dealing with not whole numbers, so I'm going to try to make as many of these
     doubles. So to do this, we're gonna have this class prompt the user for the prices and quantities of the 3 items,
    scanning them in. Then in another class, we're gonna take those numbers and multiply price_item1 * quantity_item1 and
    do that for the three items to get subtotal, using %.2f for all of these since in most currencies customers usually don't pay more than
    a hundreth. (yes i know at gas stations it goes like 2.999 but they charge us in the hundreths anyway which just turns to
    3.00). Then, tax will be subtotal *0.055 (that's percentage to decimal),  and last but not least we'll to total which will be
    subtotal + tax.  Then we'll print these out for the user to see.
     */
        System.out.println("What's the price of the first item?");
        Scanner input = new Scanner(System.in);
        String p_itm1 = input.nextLine();
        double price_item1 = Double.parseDouble(p_itm1);
        System.out.println("What's the quantity of the first item?");
        String q_itm1 = input.nextLine();
        double quantity_item1 = Double.parseDouble(q_itm1);

        System.out.println("What's the price of the second item?");
        String p_itm2 = input.nextLine();
        double price_item2 = Double.parseDouble(p_itm2);
        System.out.println("What's the quantity of the second item?");
        String q_itm2 = input.nextLine();
        double quantity_item2 = Double.parseDouble(q_itm2);

        System.out.println("What's the price of the third item?");
        String p_itm3 = input.nextLine();
        double price_item3 = Double.parseDouble(p_itm3);
        System.out.println("What's the quantity of the third item?");
        String q_itm3 = input.nextLine();
        double quantity_item3 = Double.parseDouble(q_itm3);

        Price_calculator userprice =new Price_calculator(price_item1,quantity_item1,price_item2,quantity_item2,price_item3,quantity_item3);
        //yknow I realized after making this entire solution I coulda just used an array to save myself a lot of time
        //but this is due sunday and I work the rest of the week. maybe I'll come back and fix this when I'm not so low on time


    }
}