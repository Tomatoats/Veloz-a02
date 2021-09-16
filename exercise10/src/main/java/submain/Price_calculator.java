package submain;

public class Price_calculator {
    private double p_itm1;
    private double q_itm1;
    private double p_itm2;
    private double q_itm2;
    private double p_itm3;
    private double q_itm3;

    public Price_calculator(double price1, double quan1, double price2, double quan2, double price3, double quan3) {
        p_itm1 = price1;
        q_itm1 = quan1;
        p_itm2 = price2;
        q_itm2 = quan2;
        p_itm3 = price3;
        q_itm3 = quan3;

        double tax_rate = 0.055;
        double subtotal = (p_itm1 * q_itm1) + (p_itm2 * q_itm2) + (p_itm3 * q_itm3);
        double tax = subtotal * tax_rate;
        double total = subtotal + tax;

        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", subtotal, tax, total);
    }
}

