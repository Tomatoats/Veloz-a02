package submain;

public class Tax_calculator {
    private double amount;
    private String State;
    private String County;

    private static void IfTaxApplied(double tax, double amount) {
        double tax_amount = (amount * tax) - amount;
        double total = amount + tax_amount;
        System.out.printf("The tax is $%.2f.\nThe total is $%.2f.", tax_amount, total);
    }


    public Tax_calculator(double order, String state, String county) {
        amount = order;
        State = state;
        County = county;
        double tax = 1.00;
        double no_tax_total = amount;


        if (County.equals("ignore") && State.equals("Illinois")) {
            tax = tax + 0.08;
            IfTaxApplied(tax, amount);
        } else if (County.equals("Eau Claire")) {
            tax = tax + 0.055;
            IfTaxApplied(tax, amount);
        } else if (County.equals("Dunn")) {
            tax = tax + 0.054;
            IfTaxApplied(tax, amount);
        } else if (State.equals("Wisconsin")) {
            tax = tax + 0.05;
            IfTaxApplied(tax, amount);
        }
        if (tax == 1) {
            System.out.printf("The total is $%.2f.", no_tax_total);
        }

    }
}