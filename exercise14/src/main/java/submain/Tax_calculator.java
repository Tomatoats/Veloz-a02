package submain;

public class Tax_calculator {
    private double money;
    private String ST;

    public Tax_calculator(double amount, String state) {
        money = amount;
        ST = state;
        double total = amount;
        double tax = 1.055;

        if (ST .equals("WI"))
        {
            double tax_amount = (amount * tax) - amount;
            System.out.printf("The tax is $%.2f.\n", tax_amount);
            total = amount * tax;
        }
        System.out.printf("The total is $%.2f.\n", total);

        }
    }

